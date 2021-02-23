package bean.type;

import annotatioin.bean.Person;
import bean.type.Ball;
import bean.type.Child;
import bean.type.Toy;
import bean.type.ToyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liguo
 * @Description : 类描述
 * @data : 2021/2/23
 */
@Configuration
public class BeanTypeAnnoConfiguration {

    @Bean
    public Child child() {
        return new Child();
    }

    /**
     * 会出现 NoUniqueBeanDefinitionException;说明FactoryBean创建的Bean是直接放在 IOC 容器中
     * @return
     */
    @Bean
    public Toy ball() {
        return new Ball("ball");
    }

    @Bean
    public ToyFactoryBean toyFactory() {
        return new ToyFactoryBean();
    }
}
