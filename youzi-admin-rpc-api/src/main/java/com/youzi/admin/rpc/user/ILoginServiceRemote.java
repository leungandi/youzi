package com.youzi.admin.rpc.user;

import com.youzi.admin.rpc.vo.user.UserVo;

/**
 * 登陆相关接口
 * @author ：Andrew.Song
 * @Date : 2018/7/18 22:08
 */
public interface ILoginServiceRemote {

    UserVo login(String username, String password);
}
