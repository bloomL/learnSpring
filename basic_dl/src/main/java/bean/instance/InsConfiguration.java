package bean.instance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liguo
 * @Description : 实例工厂创建Bean
 * @data : 2021/2/23
 */
@Configuration
@ComponentScan
public class InsConfiguration {

    @Bean
    public Car car(CarInstanceFactory carInstanceFactory) {
        return carInstanceFactory.getCar();
    }
}
