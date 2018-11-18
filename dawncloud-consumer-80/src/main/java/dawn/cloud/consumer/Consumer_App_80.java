package dawn.cloud.consumer;

import dawn.cloud.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/*在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效。
并且官方文档明确给出了警告：
    这个自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下，
    否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，也就是说
    我们达不到特殊化定制的目的了。*/
//那么解决方案是重新在java包下再建一个包名，并把MySelfRule类放入该包内。
@SpringBootApplication
@EnableEurekaClient//标记此为一个服务端
@RibbonClient(value = "dawncloud-dept",configuration =MySelfRule.class)
//@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,value = ExcludeFormComponentScan.class))用于自定配置RUle
public class Consumer_App_80 {
	public static void main(String[] args) {
		SpringApplication.run(Consumer_App_80.class,args);
	}
}
