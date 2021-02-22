package basic_dl.quickstart_bytype.dao.impl;

import basic_dl.quickstart_bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author : liguo
 * @Description : 类描述
 * @data : 2021/2/22
 */
public class DemoDaoImpl implements DemoDao {
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
