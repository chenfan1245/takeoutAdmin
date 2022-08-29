package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户类")
public class Tbluser {
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "用户账号（手机号）")
  private String usertel;
  @ApiModelProperty(value = "用户名")
  private String username;
  @ApiModelProperty(value = "用户密码")
  private String userpwd;
  @ApiModelProperty(value = "用户头像")
  private String userhead;
  @ApiModelProperty(value = "用户状态（启用 / 禁用）")
  private String userstate;
  @ApiModelProperty(value = "注册日期")
  private String time;

  public Tbluser() {
  }

  @Override
  public String toString() {
    return "用户{" +
            "用户id=" + userid +
            ", 角色id=" + roleid +
            ", 用户账号='" + usertel + '\'' +
            ", 用户名='" + username + '\'' +
            ", 用户密码='" + userpwd + '\'' +
            ", 用户头像='" + userhead + '\'' +
            ", 用户状态='" + userstate + '\'' +
            ", 注册时间='" + time + '\'' +
            '}';
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public String getUsertel() {
    return usertel;
  }

  public void setUsertel(String usertel) {
    this.usertel = usertel;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getUserpwd() {
    return userpwd;
  }

  public void setUserpwd(String userpwd) {
    this.userpwd = userpwd;
  }


  public String getUserhead() {
    return userhead;
  }

  public void setUserhead(String userhead) {
    this.userhead = userhead;
  }


  public String getUserstate() {
    return userstate;
  }

  public void setUserstate(String userstate) {
    this.userstate = userstate;
  }

}
