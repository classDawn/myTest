package dawn.cloud.provider.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
@EnableDiscoveryClient
public class APP_Provider_Hystrix {

	public static void main(String[] args) {
		//主启动类
		SpringApplication.run(APP_Provider_Hystrix.class,args);
	}

}
