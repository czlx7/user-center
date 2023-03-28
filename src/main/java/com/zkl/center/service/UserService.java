package com.zkl.center.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zkl.center.model.domain.User;

import javax.servlet.http.HttpServletRequest;


/**
* @author 19552
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-03-26 20:26:49
*/
public interface UserService extends IService<User> {


    long userRegister(String userAccount, String userPassword, String checkPassword,String planetCode);

    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafeUser(User orginUser);

    int userLogout(HttpServletRequest request);
}
