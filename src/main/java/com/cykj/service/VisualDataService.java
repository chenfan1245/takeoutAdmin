package com.cykj.service;

import com.cykj.bean.Tbluser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VisualDataService {
    // 查询用户人数
    long findUserNum();
    // 查询骑手人数
    long findRiderNum();
    // 查询商家数量
    long findShopNum();
    // 查询每种商品类型的商品数量
    long findType(long typeid);
    // 查询每个月的用户数量
    long findUser(String starttime, String endtime);
    // 查询不同地区的商家数量
    long findShop(String shopaddress);
    // 查询每个月的完成单数量
    long findFinish(String starttime, String endtime);
    // 查询每个月的取消单和退单数量
    long findCancel(String starttime, String endtime);
}
