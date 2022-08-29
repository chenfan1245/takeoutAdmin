package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@ApiModel("订单类")
public class Tblorder {
  /*订单类*/
  @ApiModelProperty(value = "订单id")
  private long orderid;
  @ApiModelProperty(value = "收获地址id")
  private long addressid;
  @ApiModelProperty(value = "使用的用户红包id")
  private long redpacketid;
  @ApiModelProperty(value = "商家id")
  private long shopid;
  @ApiModelProperty(value = "骑手id")
  private long riderid;
  @ApiModelProperty(value = "订单编号（随机）")
  private String orderno;
  @ApiModelProperty(value = "订单备注")
  private String orderinfo;
  @ApiModelProperty(value = "下单时间")
  private Timestamp ordertime;
  @ApiModelProperty(value = "送达时间")
  private Timestamp deliverytime;
  @ApiModelProperty(value = "实付款（商品总价格 - 红包金额）")
  private double actualmoney;
  @ApiModelProperty(value = "配送费")
  private double deliveryfee;
  @ApiModelProperty(value = "支付状态（支付中 / 已支付）")
  private String paystate;
  @ApiModelProperty(value = "订单状态（待商家接单 / 待骑手抢单 / 商家备货中 / 待骑手取货 / 待送达 / 已完成 / 已取消 / 退单中 / 已退单）")
  private String orderstate;

  /*店铺类*/
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "店铺名称")
  private String shopname;
  @ApiModelProperty(value = "店铺商标")
  private String brand;
  @ApiModelProperty(value = "商家登录的帐号（手机号）")
  private String shoptel;
  @ApiModelProperty(value = "开始营业时间")
  private Time opentime;
  @ApiModelProperty(value = "结束营业时间")
  private Time endtime;
  @ApiModelProperty(value = "店铺地址")
  private String shopaddress;
  @ApiModelProperty(value = "店铺状态（营业 / 休息）")
  private String shopstate;
  @ApiModelProperty(value = "店铺评分")
  private double shopscore;
  /*用户收货地址类*/
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "收货人手机号")
  private String rectel;
  @ApiModelProperty(value = "收获地址")
  private String recaddress;
  @ApiModelProperty(value = "门牌号")
  private String housenum;
  @ApiModelProperty(value = "收货人姓名")
  private String recname;
  @ApiModelProperty(value = "备注（家 / 公司 / 学校）")
  private String info;
  /*骑手类*/
  @ApiModelProperty(value = "骑手姓名")
  private String ridername;
  @ApiModelProperty(value = "骑手帐号（手机号）")
  private String ridertel;
  @ApiModelProperty(value = "头像")
  private String riderhead;
  @ApiModelProperty(value = "审核状态（未审核 / 审核通过 / 审核未通过）")
  private String auditstate;
  @ApiModelProperty(value = "骑手状态（启用 / 禁用 / 未通过实名认证 / 通过实名认证 / 未通过安全考核 / 通过安全考核）")
  private String riderstate;
  @ApiModelProperty(value = "余额")
  private double balance;
  @ApiModelProperty(value = "商品列表")
  private List<Tblgoods> goodsList;

  @Override
  public String toString() {
    return "订单{" +
            "订单id=" + orderid +
            ", 地址id=" + addressid +
            ", 红包id=" + redpacketid +
            ", 商家id=" + shopid +
            ", 骑手id=" + riderid +
            ", 订单编号='" + orderno + '\'' +
            ", 订单备注='" + orderinfo + '\'' +
            ", 下单时间=" + ordertime +
            ", 送达时间=" + deliverytime +
            ", 实付款=" + actualmoney +
            ", 配送费=" + deliveryfee +
            ", 支付状态='" + paystate + '\'' +
            ", 订单状态='" + orderstate + '\'' +
            ", 角色id=" + roleid +
            ", 店铺名称='" + shopname + '\'' +
            ", 店铺商标='" + brand + '\'' +
            ", 商家电话='" + shoptel + '\'' +
            ", 开始营业时间=" + opentime +
            ", 结束营业时间=" + endtime +
            ", 店铺地址='" + shopaddress + '\'' +
            ", 商家状态='" + shopstate + '\'' +
            ", 店铺评分=" + shopscore +
            ", 用户id=" + userid +
            ", 收获电话='" + rectel + '\'' +
            ", 收获地址='" + recaddress + '\'' +
            ", 门牌号='" + housenum + '\'' +
            ", 收货姓名='" + recname + '\'' +
            ", 收货备注='" + info + '\'' +
            ", 骑手姓名='" + ridername + '\'' +
            ", 骑手电话='" + ridertel + '\'' +
            ", 骑手头像='" + riderhead + '\'' +
            ", 骑手审核状态='" + auditstate + '\'' +
            ", 骑手状态='" + riderstate + '\'' +
            ", 骑手收入=" + balance +
            ", 商品列表=" + goodsList +
            '}' + '\n';
  }

  public List<Tblgoods> getGoodsList() {
    return goodsList;
  }

  public void setGoodsList(List<Tblgoods> goodsList) {
    this.goodsList = goodsList;
  }

  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }

  public long getAddressid() {
    return addressid;
  }

  public void setAddressid(long addressid) {
    this.addressid = addressid;
  }

  public long getRedpacketid() {
    return redpacketid;
  }

  public void setRedpacketid(long redpacketid) {
    this.redpacketid = redpacketid;
  }

  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }

  public long getRiderid() {
    return riderid;
  }

  public void setRiderid(long riderid) {
    this.riderid = riderid;
  }

  public String getOrderno() {
    return orderno;
  }

  public void setOrderno(String orderno) {
    this.orderno = orderno;
  }

  public String getOrderinfo() {
    return orderinfo;
  }

  public void setOrderinfo(String orderinfo) {
    this.orderinfo = orderinfo;
  }

  public Timestamp getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(Timestamp ordertime) {
    this.ordertime = ordertime;
  }

  public Timestamp getDeliverytime() {
    return deliverytime;
  }

  public void setDeliverytime(Timestamp deliverytime) {
    this.deliverytime = deliverytime;
  }

  public double getActualmoney() {
    return actualmoney;
  }

  public void setActualmoney(double actualmoney) {
    this.actualmoney = actualmoney;
  }

  public double getDeliveryfee() {
    return deliveryfee;
  }

  public void setDeliveryfee(double deliveryfee) {
    this.deliveryfee = deliveryfee;
  }

  public String getPaystate() {
    return paystate;
  }

  public void setPaystate(String paystate) {
    this.paystate = paystate;
  }

  public String getOrderstate() {
    return orderstate;
  }

  public void setOrderstate(String orderstate) {
    this.orderstate = orderstate;
  }

  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }

  public String getShopname() {
    return shopname;
  }

  public void setShopname(String shopname) {
    this.shopname = shopname;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getShoptel() {
    return shoptel;
  }

  public void setShoptel(String shoptel) {
    this.shoptel = shoptel;
  }

  public Time getOpentime() {
    return opentime;
  }

  public void setOpentime(Time opentime) {
    this.opentime = opentime;
  }

  public Time getEndtime() {
    return endtime;
  }

  public void setEndtime(Time endtime) {
    this.endtime = endtime;
  }

  public String getShopaddress() {
    return shopaddress;
  }

  public void setShopaddress(String shopaddress) {
    this.shopaddress = shopaddress;
  }

  public String getShopstate() {
    return shopstate;
  }

  public void setShopstate(String shopstate) {
    this.shopstate = shopstate;
  }

  public double getShopscore() {
    return shopscore;
  }

  public void setShopscore(double shopscore) {
    this.shopscore = shopscore;
  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

  public String getRectel() {
    return rectel;
  }

  public void setRectel(String rectel) {
    this.rectel = rectel;
  }

  public String getRecaddress() {
    return recaddress;
  }

  public void setRecaddress(String recaddress) {
    this.recaddress = recaddress;
  }

  public String getHousenum() {
    return housenum;
  }

  public void setHousenum(String housenum) {
    this.housenum = housenum;
  }

  public String getRecname() {
    return recname;
  }

  public void setRecname(String recname) {
    this.recname = recname;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getRidername() {
    return ridername;
  }

  public void setRidername(String ridername) {
    this.ridername = ridername;
  }

  public String getRidertel() {
    return ridertel;
  }

  public void setRidertel(String ridertel) {
    this.ridertel = ridertel;
  }

  public String getRiderhead() {
    return riderhead;
  }

  public void setRiderhead(String riderhead) {
    this.riderhead = riderhead;
  }

  public String getAuditstate() {
    return auditstate;
  }

  public void setAuditstate(String auditstate) {
    this.auditstate = auditstate;
  }

  public String getRiderstate() {
    return riderstate;
  }

  public void setRiderstate(String riderstate) {
    this.riderstate = riderstate;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
