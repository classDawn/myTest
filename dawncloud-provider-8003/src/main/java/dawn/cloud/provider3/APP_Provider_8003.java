package dawn.cloud.provider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//发现服务费
public class APP_Provider_8003 {

	public static void main(String[] args) {
		SpringApplication.run(APP_Provider_8003.class,args);
	}

}
