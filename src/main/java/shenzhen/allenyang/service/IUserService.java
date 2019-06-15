package shenzhen.allenyang.service;


import shenzhen.allenyang.entity.User;

import java.util.List;

/**
 * 用户的业务层接口
 * @Author: 杨强
 * @Date: 2019/6/15 13:28
 * @Version 1.0
 */
public interface IUserService {

    List<User> findAll();

    User findById(Integer userId);

    void updateUser(User user);
}
