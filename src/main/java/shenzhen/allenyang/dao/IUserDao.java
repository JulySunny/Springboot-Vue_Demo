package shenzhen.allenyang.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import shenzhen.allenyang.entity.User;

import java.util.List;

/**
 * 用户的持久层接口
 * @Author: 杨强
 * @Date: 2019/6/15 13:23
 * @Version 1.0
 */
@Mapper
public interface IUserDao {


    /**
     * 查询列表
     * @return {@link List}
     */
    @Select("select * from user ")
    List<User> findAll();

    /**
     * 查询用户
     * @param userId
     * @return {@link User}
     */
    @Select("select * from user where id= #{userId}")
    User findById(Integer userId);

    /**
     * 更新用户
     * @param user {@link User}
     */
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id = #{id}")
    void updateUser(User user);
}
