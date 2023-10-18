package com.cy.store.mapper;


import com.cy.store.entity.User;

//用户模块持久层接口
public interface UserMapper {
    /**     快速生成注释/**
     * 插入用户的数据
     * @param user 用户的数据
     * @return 受影响行数（增删改查，都受影响的行数作为返回值，根据返回值来判断执行是否成功）
     */
    Integer insert(User user);

    /**
     *根据用户名来查询用户数据
     * @param username 用户名
     * @return如果找到对应的用户则返回这个用户数据
     */
    User findByUsername(String username);
}
