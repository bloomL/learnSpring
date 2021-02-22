package basic_di.quickstart_set;

import basic_di.quickstart_set.bean.Cat;
import basic_di.quickstart_set.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : liguo
 * @Description : 类描述
 * @data : 2021/2/22
 */
public class QuickstartInjectBySetXmlApplication {

    public static void main(String[] args) throws Exception{
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_di/inject_set.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);
        Cat cat = factory.getBean(Cat.class);
        System.out.println(cat);
    }
}
