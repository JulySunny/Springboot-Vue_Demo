package shenzhen.allenyang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shenzhen.allenyang.dao.IUserDao;
import shenzhen.allenyang.entity.User;
import shenzhen.allenyang.service.IUserService;

import java.util.List;

/**
 * @Author: 杨强
 * @Date: 2019/6/15 13:29
 * @Version 1.0
 */
@Service
public class UserService implements IUserService {

    @Autowired
    IUserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(Integer userId) {
        return userDao.findById(userId);
    }

    public void updateUser(User user) {
         userDao.updateUser(user);
    }
}
