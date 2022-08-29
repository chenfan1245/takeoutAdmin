package com.cykj.bean;


public class Tblpower {

  private long powerid;
  private String powername;
  private String powerurl;
  private long parentid;


  public long getPowerid() {
    return powerid;
  }

  public void setPowerid(long powerid) {
    this.powerid = powerid;
  }


  public String getPowername() {
    return powername;
  }

  public void setPowername(String powername) {
    this.powername = powername;
  }


  public String getPowerurl() {
    return powerurl;
  }

  public void setPowerurl(String powerurl) {
    this.powerurl = powerurl;
  }


  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }

}
