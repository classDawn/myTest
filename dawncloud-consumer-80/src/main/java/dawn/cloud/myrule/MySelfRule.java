package dawn.cloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
	/**
	 * 在配置自定义Rule是需要铭记--此配置文件不可以放在component扫描的包下面
	 *	否则将会造成全 客户端共享,就达不到特殊的定义了
	 * @return
	 */

	@Bean
	public IRule myRule(){
		return new RandomRule();
	}
}
