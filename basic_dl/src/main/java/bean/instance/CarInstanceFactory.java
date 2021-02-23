package bean.instance;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : liguo
 * @Description : 实例工厂创建Bean
 * @data : 2021/2/23
 */
@Component
public class CarInstanceFactory {
    public Car getCar() {
        return new Car();
    }
}
