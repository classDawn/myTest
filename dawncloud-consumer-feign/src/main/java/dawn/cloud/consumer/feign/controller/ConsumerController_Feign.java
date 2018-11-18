package dawn.cloud.consumer.feign.controller;

import dawn.cloud.api.entity.Dept;
import dawn.cloud.api.service.Dept_FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
public class ConsumerController_Feign {

	@Autowired
	private Dept_FeignService dept_feignService;

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.dept_feignService.get(id);
	}

	/**
	 *
	 * @return
	 */
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.dept_feignService.list();
	}

	/**
	 * 注意这个操作
	 * @param dept
	 * @return
	 */
	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept) {
		return this.dept_feignService.add(dept);
	}



}
