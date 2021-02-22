package basic_dl.withanno.anno;

import java.lang.annotation.*;

/**
 * @author : liguo
 * @Description : 注解
 * @data : 2021/2/22
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Color {
}
