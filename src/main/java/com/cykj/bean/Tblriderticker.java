package com.cykj.bean;


public class Tblriderticker {

  private long tickerid;
  private long riderid;
  private long orderid;
  private long staffid;
  private double ticketmoney;
  private String ticketreson;
  private String ticketstatus;


  public long getTickerid() {
    return tickerid;
  }

  public void setTickerid(long tickerid) {
    this.tickerid = tickerid;
  }


  public long getRiderid() {
    return riderid;
  }

  public void setRiderid(long riderid) {
    this.riderid = riderid;
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getStaffid() {
    return staffid;
  }

  public void setStaffid(long staffid) {
    this.staffid = staffid;
  }


  public double getTicketmoney() {
    return ticketmoney;
  }

  public void setTicketmoney(double ticketmoney) {
    this.ticketmoney = ticketmoney;
  }


  public String getTicketreson() {
    return ticketreson;
  }

  public void setTicketreson(String ticketreson) {
    this.ticketreson = ticketreson;
  }


  public String getTicketstatus() {
    return ticketstatus;
  }

  public void setTicketstatus(String ticketstatus) {
    this.ticketstatus = ticketstatus;
  }

}
