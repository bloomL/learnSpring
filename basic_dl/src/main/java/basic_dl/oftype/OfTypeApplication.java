package basic_dl.oftype;

import basic_dl.oftype.dao.DemoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author : liguo
 * @Description : 一个接口有多个实现，而咱又想一次性把这些都拿出来，那 getBean 方法显然就不够用了，
 * @data : 2021/2/22
 */
public class OfTypeApplication {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart_oftype.xml");
        Map<String, DemoDao> beans = ctx.getBeansOfType(DemoDao.class);
        beans.forEach((beanName,bean) -> {
            System.out.println(beanName + " : " + bean);
        });
    }
}
