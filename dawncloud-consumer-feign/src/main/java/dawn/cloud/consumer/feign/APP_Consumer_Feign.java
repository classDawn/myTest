package dawn.cloud.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"dawn.cloud.api"})//定义的feignClient在哪个包下
@ComponentScan("dawn.cloud.consumer.feign")
public class APP_Consumer_Feign {

	public static void main(String[] args) {
		SpringApplication.run(APP_Consumer_Feign.class,args);
	}
}
