package com.cykj.web;

import com.alibaba.fastjson.JSON;
import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblorder;
import com.cykj.bean.Tbluser;
import com.cykj.service.VisualDataService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
@RequestMapping("/system")
public class AdminController {
    @Autowired
    HttpSession session;
    @Autowired
    private VisualDataService service;

    /* 查询可视化数据所需数据 */
    @ApiOperation(value = "find",notes = "查询可视化数据所需数据")
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "orderid",value = "点击订单，查看订单详细信息")
    })
    @CrossOrigin    // 解决跨域问题
    @RequestMapping(value="/find",produces = { "text/html;charset=UTF-8;", "application/json;charset=UTF-8;" })
    public String find(){
        // 用户人数
        long userNum = service.findUserNum();
        // 骑手人数
        long riderNum = service.findRiderNum();
        // 商家数量
        long shopNum = service.findShopNum();
        // 每种商品类型的数量
        List<Long> typeList = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            long type = service.findType(i);
            typeList.add(type);
        }
        // 查询每个月的新增用户
        List<Long> user2021List = new ArrayList<>();
        List<Long> user2022List = new ArrayList<>();
        for (int i = 2021; i < 2023; i++) {
            long month1 = service.findUser(i+"-01-01", i+"-01-31");
            long month2 = service.findUser(i+"-02-01", i+"-02-28");
            long month3 = service.findUser(i+"-03-01", i+"-03-31");
            long month4 = service.findUser(i+"-04-01", i+"-04-30");
            long month5 = service.findUser(i+"-05-01", i+"-05-31");
            long month6 = service.findUser(i+"-06-01", i+"-06-30");
            long month7 = service.findUser(i+"-07-01", i+"-07-31");
            long month8 = service.findUser(i+"-08-01", i+"-08-31");
            long month9 = service.findUser(i+"-09-01", i+"-09-30");
            long month10 = service.findUser(i+"-10-01", i+"-10-31");
            long month11 = service.findUser(i+"-11-01", i+"-11-30");
            long month12 = service.findUser(i+"-12-01", i+"-12-31");
            if (i == 2021) {
                Collections.addAll(user2021List,month1,month2,month3,month4,month5,month6,month7,month8,month9,month10,month11,month12);
            } else {
                Collections.addAll(user2022List,month1,month2,month3,month4,month5,month6,month7,month8,month9,month10,month11,month12);
            }
        }
        // 查询不同地区的商家数量
        List<String> provinceList = new ArrayList<>(); // 省份名
        List<Long> shopNumList = new ArrayList<>(); // 该省份的店铺数量
        String[] province = {"河北","山西","辽宁","吉林","黑龙江","江苏","浙江","安徽","福建","江西","山东","河南",
                             "湖北","湖南","广东","海南","四川","贵州","云南","陕西","甘肃","青海","台湾","内蒙古",
                             "广西","西藏","宁夏","新疆","北京","上海","天津","重庆","香港","澳门"};
        for (int i = 0; i < province.length; i++) {
            long shopAddNum = service.findShop(province[i]);
            if (shopAddNum > 0) {
                provinceList.add(province[i]);
                shopNumList.add(shopAddNum);
            }
        }
        // 查询每个月的完成单和取消
        List<Long> finishOrderList = new ArrayList<>();
        List<Long> cancelOrderList = new ArrayList<>();
        // 完成单
        long f1 = service.findFinish("2022-01-01 00:00:00", "2022-01-31 23:59:59");
        long f2 = service.findFinish("2022-02-01 00:00:00", "2022-02-28 23:59:59");
        long f3 = service.findFinish("2022-03-01 00:00:00", "2022-03-31 23:59:59");
        long f4 = service.findFinish("2022-04-01 00:00:00", "2022-04-30 23:59:59");
        long f5 = service.findFinish("2022-05-01 00:00:00", "2022-05-31 23:59:59");
        long f6 = service.findFinish("2022-06-01 00:00:00", "2022-06-30 23:59:59");
        long f7 = service.findFinish("2022-07-01 00:00:00", "2022-07-31 23:59:59");
        long f8 = service.findFinish("2022-08-01 00:00:00", "2022-08-31 23:59:59");
        long f9 = service.findFinish("2022-09-01 00:00:00", "2022-09-30 23:59:59");
        long f10 = service.findFinish("2022-10-01 00:00:00", "2022-10-31 23:59:59");
        long f11 = service.findFinish("2022-11-01 00:00:00", "2022-11-30 23:59:59");
        long f12 = service.findFinish("2022-12-01 00:00:00", "2022-12-31 23:59:59");
        Collections.addAll(finishOrderList,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12);
        // 取消单
        long c1 = service.findCancel("2022-01-01 00:00:00", "2022-01-31 23:59:59");
        long c2 = service.findCancel("2022-02-01 00:00:00", "2022-02-28 23:59:59");
        long c3 = service.findCancel("2022-03-01 00:00:00", "2022-03-31 23:59:59");
        long c4 = service.findCancel("2022-04-01 00:00:00", "2022-04-30 23:59:59");
        long c5 = service.findCancel("2022-05-01 00:00:00", "2022-05-31 23:59:59");
        long c6 = service.findCancel("2022-06-01 00:00:00", "2022-06-30 23:59:59");
        long c7 = service.findCancel("2022-07-01 00:00:00", "2022-07-31 23:59:59");
        long c8 = service.findCancel("2022-08-01 00:00:00", "2022-08-31 23:59:59");
        long c9 = service.findCancel("2022-09-01 00:00:00", "2022-09-30 23:59:59");
        long c10 = service.findCancel("2022-10-01 00:00:00", "2022-10-31 23:59:59");
        long c11 = service.findCancel("2022-11-01 00:00:00", "2022-11-30 23:59:59");
        long c12 = service.findCancel("2022-12-01 00:00:00", "2022-12-31 23:59:59");
        Collections.addAll(cancelOrderList,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);


        Map<String, Object> map = new HashMap<>();
        map.put("userNum", userNum);
        map.put("riderNum", riderNum);
        map.put("shopNum", shopNum);
        map.put("typeList", typeList);
        map.put("user2021List", user2021List);
        map.put("user2022List", user2022List);
        map.put("provinceList", provinceList);
        map.put("shopNumList", shopNumList);
        map.put("finishOrderList", finishOrderList);
        map.put("cancelOrderList", cancelOrderList);
        String json = JSON.toJSONString(map);
        return json;
    }

}
