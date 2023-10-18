package com.cy.store.mapper;

import com.cy.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//SpringBootTest：标注当前的类为测试类，不会随同项目一起打包发送
@SpringBootTest
//手动打包 1.将junit4添加到类路径中  2.再次
//Runwith启动这个单元测试类（不写的话单元测试类不能运行），需要传递一个参数，必须是springrunner的实例类型
@RunWith(SpringRunner.class)
public class UserMapperTests {
    // 红线问题：idea有检测功能，接口不能直接创建bean的（之所以不管也可以正常，
    // 是因为idea在运行的时候有创建动态代理）
    @Autowired
    private UserMapper userMapper;
    /**
     * 单元测试方法：可以独立运行，不用启动整个程序，可以做单元测试，提升了代码的测试效率
     * 1.必须被test注解修饰
     * 2.返回值必须为void
     * 3.方法的参数列表不指定任何类型
     * 4.方法的访问修饰符必须是public
     */
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("user01");
        user.setPassword("123456");
        Integer rows = userMapper.insert(user);
        System.out.println("rows=" + rows);
    }

    @Test
    public void findByUsername() {
        String username = "user01";
        User result = userMapper.findByUsername(username);
        System.out.println(result);
    }
}
