package bean.instance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liguo
 * @Description : 静态工厂配置类
 * @data : 2021/2/23
 */
@Configuration
public class StaticConfiguration {

    @Bean
    public Car car () {
        return CarStaticFactory.getCar();
    }
}
