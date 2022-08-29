package com.cykj.bean;


public class Tblriderappeal {

  private long appealid;
  private long tickerid;
  private long staffid;
  private String appealcontent;
  private String appealstatus;


  public long getAppealid() {
    return appealid;
  }

  public void setAppealid(long appealid) {
    this.appealid = appealid;
  }


  public long getTickerid() {
    return tickerid;
  }

  public void setTickerid(long tickerid) {
    this.tickerid = tickerid;
  }


  public long getStaffid() {
    return staffid;
  }

  public void setStaffid(long staffid) {
    this.staffid = staffid;
  }


  public String getAppealcontent() {
    return appealcontent;
  }

  public void setAppealcontent(String appealcontent) {
    this.appealcontent = appealcontent;
  }


  public String getAppealstatus() {
    return appealstatus;
  }

  public void setAppealstatus(String appealstatus) {
    this.appealstatus = appealstatus;
  }

}
