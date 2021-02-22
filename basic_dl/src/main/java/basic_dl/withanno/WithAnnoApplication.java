package basic_dl.withanno;

import basic_di.quickstart_set.bean.Cat;
import basic_dl.withanno.anno.Color;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @author : liguo
 * @Description : 类描述
 * @data : 2021/2/22
 */
public class WithAnnoApplication {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/basic_dl/quickstart_withanno.xml");
        // 获取有@Color注解的bean
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Color.class);
        // 获取所有ioc所有bean
        String[] beanNames = ctx.getBeanDefinitionNames();
        beans.forEach((beanName,bean) -> {
            System.out.println(beanName +" : "+bean);
        });
        Stream.of(beanNames).forEach(System.out::println);
        ObjectProvider<Cat> beanProvider = ctx.getBeanProvider(Cat.class);
        Cat cat = beanProvider.getIfAvailable();
        if (cat ==null) {
            cat = new Cat();
        }
    }
}
