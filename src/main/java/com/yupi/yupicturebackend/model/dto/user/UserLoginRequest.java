package com.yupi.yupicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/*
* 用户登录请求
* */
@Data
public class UserLoginRequest implements Serializable {


    private static final long serialVersionUID = 2926047212422757352L;
    private String userAccount;
    private String userPassword;

}

