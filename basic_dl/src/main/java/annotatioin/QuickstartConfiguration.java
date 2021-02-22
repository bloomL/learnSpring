package annotatioin;

import annotatioin.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liguo
 * @Description : 配置类
 * @data : 2021/2/22
 */
@Configuration
public class QuickstartConfiguration {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("person");
        person.setAge(123);
        return person;
    }
}
