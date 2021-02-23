package bean.instance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liguo
 * @Description : BeanFactory配置类
 * @data : 2021/2/23
 */
@Configuration
public class BeanFactoryConfiguration {

    @Bean
    public BallFactoryBean ballFactoryBean() {
        return new BallFactoryBean();
    }
}
