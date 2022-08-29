package com.cykj.mapper;

import com.cykj.bean.Tbluser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VisualDataMapper {
    // 查询用户人数
    long findUserNum();
    // 查询骑手人数
    long findRiderNum();
    // 查询商家数量
    long findShopNum();
    // 查询每种商品类型的商品数量
    long findType(@Param("typeid")long typeid);
    // 查询每个月的用户数量
    long findUser(@Param("starttime")String starttime, @Param("endtime")String endtime);
    // 查询不同地区的商家数量
    long findShop(@Param("shopaddress")String shopaddress);
    // 查询每个月的完成单数量
    long findFinish(@Param("starttime")String starttime, @Param("endtime")String endtime);
    // 查询每个月的取消单和退单数量
    long findCancel(@Param("starttime")String starttime, @Param("endtime")String endtime);
}
