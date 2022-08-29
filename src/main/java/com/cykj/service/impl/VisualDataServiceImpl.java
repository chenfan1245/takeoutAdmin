package com.cykj.service.impl;

import com.cykj.bean.Tbluser;
import com.cykj.mapper.VisualDataMapper;
import com.cykj.service.VisualDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisualDataServiceImpl implements VisualDataService {
    @Autowired
    private VisualDataMapper mapper;

    // 查询用户人数
    @Override
    public long findUserNum() {
        return mapper.findUserNum();
    }

    // 查询骑手人数
    @Override
    public long findRiderNum() {
        return mapper.findRiderNum();
    }

    // 查询商家数量
    @Override
    public long findShopNum() {
        return mapper.findShopNum();
    }

    // 查询每种商品类型的商品数量
    @Override
    public long findType(long typeid) {
        return mapper.findType(typeid);
    }

    @Override
    public long findUser(String starttime, String endtime) {
        return mapper.findUser(starttime, endtime);
    }

    // 查询不同地区的商家数量
    @Override
    public long findShop(String shopaddress) {
        return mapper.findShop(shopaddress);
    }

    // 查询每个月的完成单数量
    @Override
    public long findFinish(String starttime, String endtime) {
        return mapper.findFinish(starttime, endtime);
    }

    // 查询每个月的取消单和退单数量
    @Override
    public long findCancel(String starttime, String endtime) {
        return mapper.findCancel(starttime, endtime);
    }
}
