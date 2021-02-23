package bean.instance;

/**
 * @author : liguo
 * @Description : 静态工程创建Bean
 * @data : 2021/2/23
 */
public class CarStaticFactory {
    public static Car getCar() {
        return new Car();
    }
}
