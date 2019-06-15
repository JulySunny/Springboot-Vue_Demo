package shenzhen.allenyang.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shenzhen.allenyang.entity.User;
import shenzhen.allenyang.service.IUserService;

import java.util.List;

/**
 * @Author: 杨强
 * @Date: 2019/6/15 13:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 查询用户
     * @param userId
     * @return
     */
    @RequestMapping("/findById")
    public User findById(Integer userId) {
        return userService.findById(userId);
//        return "222";
    }

    /**
     * 更新用户
     * @param user
     */
    @RequestMapping("/update")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

}
