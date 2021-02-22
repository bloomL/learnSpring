package basic_dl.quickstart_bytype;

import basic_dl.quickstart_bytype.bean.Person;
import basic_dl.quickstart_bytype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : liguo
 * @Description : byType 依赖查找 DL
 * @data : 2021/2/22
 */
public class QuickstartByTypeApplication {

    public static void main(String[] args) throws Exception{
        // 读取配置文件
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart_bytype.xml");
        // 根据Class获取bean
        Person person = factory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = factory.getBean(DemoDao.class);
        System.out.println(demoDao.findAll());
    }
}
