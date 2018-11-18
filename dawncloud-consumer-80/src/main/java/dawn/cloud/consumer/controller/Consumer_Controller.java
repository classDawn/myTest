package dawn.cloud.consumer.controller;

import dawn.cloud.api.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Consumer_Controller {


	@Autowired
	private RestTemplate template;

	@Autowired
	private DiscoveryClient discoveryClient;

	//private static final String REST_URL_PREFIX="http://localhost:8001";
	private static final String REST_URL_PREFIX="http://dawncloud-dept";

	/*发现-------------用于发现eureka注册表中已经注册的服务*/
	@RequestMapping(value = "/consumer/discovery")
	public Object discovery(){

		//获取eureka注册中心中的所有服务
		List<String> services = discoveryClient.getServices();
		//根据服务名称获取服务下的所有实力节点
		List<ServiceInstance> instances = discoveryClient.getInstances("dawncloud-dept");
		if (services!=null && services.size()>0){
			for (String ss:services){
				System.out.println("注册表中的服务有:----->"+ss);
			}

			return services;
		}
		return null;
	}


	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept){

		return template.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return template.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return template.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}






}
