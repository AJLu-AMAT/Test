package com.amat.zhonghuanmes.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("User Entity")
public class User {
    @ApiModelProperty("User ID")
    private String userId;

    @ApiModelProperty("User Name")
    private String userName;

    @ApiModelProperty("Password")
    private String passWord;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassWord(){
        return passWord;
    }

    public void setPassWord(String password)
    {
        this.passWord = password;
    }
}
