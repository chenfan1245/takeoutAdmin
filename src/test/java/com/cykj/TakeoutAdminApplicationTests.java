package com.cykj;

import com.cykj.bean.Tbluser;
import com.cykj.service.VisualDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class TakeoutAdminApplicationTests {
    @Autowired
    VisualDataService service;

    @Test
    void contextLoads() {

        // 测试
        List<String> provinceList = new ArrayList<>(); // 省份名
        List<Long> shopNumList = new ArrayList<>(); // 该省份的店铺数量
        List<String> shopAddressList = new ArrayList<>();
        String[] province = {"河北","山西","辽宁","吉林","黑龙江","江苏","浙江","安徽","福建","江西","山东","河南",
                "湖北","湖南","广东","海南","四川","贵州","云南","陕西","甘肃","青海","台湾","内蒙古",
                "广西","西藏","宁夏","新疆","北京","上海","天津","重庆","香港","澳门"};
        for (int i = 0; i < province.length; i++) {
            long shopAddNum = service.findShop(province[i]);
            if (shopAddNum > 0) {
                provinceList.add(province[i]);
                shopNumList.add(shopAddNum);
                shopAddressList.add("{ value: "+shopAddNum+", name: "+province[i]+" }");
            }
        }

        // 打印
        System.out.println("-------------------------------------------------------------");
        System.out.println("列表："+shopAddressList);
        System.out.println("-------------------------------------------------------------");
    }

}
