package basic_dl.quickstart_byname;

import basic_dl.quickstart_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : liguo
 * @Description : byName 依赖查找 DL
 * @data : 2021/2/22
 */
public class QuickstartByNameApplication {

    public static void main(String[] args) throws Exception{
        // 读取配置文件
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart_byname.xml");
        // 根据id获取bean
        Person person = (Person)factory.getBean("person");
        System.out.println(person);
    }
}
