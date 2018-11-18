package dawn.cloud.eureka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class APP_Eureka_7003 {

	public static void main(String[] args) {
		SpringApplication.run(APP_Eureka_7003.class,args);
	}
}
