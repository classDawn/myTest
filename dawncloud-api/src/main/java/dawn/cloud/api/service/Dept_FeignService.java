package dawn.cloud.api.service;

import dawn.cloud.api.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "dawncloud-dept")//向哪个服务发送请求
public interface Dept_FeignService {

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	boolean add(Dept dept);


	/**
	 * 说明:
	 *
	 * 	使用netfix 下的feign代替restTemplat访问服务
	 * 指定访问的服务器---使用springmvc的方式直接访问对应服务的controller层对外暴露的接口
	 * 并返回信息
	 *
	 */


}
