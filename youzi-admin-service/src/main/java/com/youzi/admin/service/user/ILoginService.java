package com.youzi.admin.service.user;


import com.youzi.admin.core.entity.user.User;

/**
 * 用户相关接口
 * @author ：Andrew.Song
 * @Date : 2018/7/18 22:11
 */
public interface ILoginService {

    User login(String username, String password);
}
