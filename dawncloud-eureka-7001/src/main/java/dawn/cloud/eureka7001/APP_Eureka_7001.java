package dawn.cloud.eureka7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//表示此服务为Eureka注册中心服务
public class APP_Eureka_7001 {

	public static void main(String[] args) {
		SpringApplication.run(APP_Eureka_7001.class,args);
	}

}
