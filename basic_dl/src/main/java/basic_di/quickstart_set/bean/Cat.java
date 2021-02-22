package basic_di.quickstart_set.bean;

/**
 * @author : liguo
 * @Description : 类描述
 * @data : 2021/2/22
 */
public class Cat {
    private String name;
    private Person master;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", master=" + master +
                '}';
    }
}
