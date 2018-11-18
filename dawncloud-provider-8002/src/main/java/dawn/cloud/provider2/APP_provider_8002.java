package dawn.cloud.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class APP_provider_8002 {
	public static void main(String[] args) {
		SpringApplication.run(APP_provider_8002.class,args);
	}
}
