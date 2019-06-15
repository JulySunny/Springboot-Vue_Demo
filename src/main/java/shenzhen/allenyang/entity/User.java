package shenzhen.allenyang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: 杨强
 * @Date: 2019/6/15 13:20
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 4908191280769930137L;

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private String email;



}
