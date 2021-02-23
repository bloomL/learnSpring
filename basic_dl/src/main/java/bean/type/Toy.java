package bean.type;

/**
 * @author : liguo
 * @Description : 类描述
 * @data : 2021/2/23
 */
public abstract class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
