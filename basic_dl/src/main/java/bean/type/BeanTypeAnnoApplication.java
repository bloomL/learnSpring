package bean.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author : liguo
 * @Description : 类描述
 * @data : 2021/2/23
 */
public class BeanTypeAnnoApplication {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeAnnoConfiguration.class);
        // Toy toy = ctx.getBean(Toy.class);
        // System.out.println(toy);
        Map<String, Toy> toys = ctx.getBeansOfType(Toy.class);
        toys.forEach((name, toy) -> {
            System.out.println("toy name : " + name + ", " + toy.toString());
        });
    }
}
