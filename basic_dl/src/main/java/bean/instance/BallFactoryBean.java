package bean.instance;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author : liguo
 * @Description : FactoryBean创建Bean
 * @data : 2021/2/23
 */
public class BallFactoryBean implements FactoryBean<Ball> {
    @Override
    public Ball getObject() throws Exception {
        return new Ball();
    }

    @Override
    public Class<Ball> getObjectType() {
        return Ball.class;
    }
}
