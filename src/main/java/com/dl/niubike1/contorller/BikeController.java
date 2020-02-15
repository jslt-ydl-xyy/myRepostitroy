package com.dl.niubike1.contorller;


import com.dl.niubike1.pojo.Bike;
import com.dl.niubike1.service.BikeServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BikeController {


//    @GetMapping("/bike")
//    @ResponseBody  //响应Ajax请求，会将响应的对象转成json
//    public String getById(String id) {
//        //(@RequestBody请求时结束json类型的数据
//        System.out.println(id);
//        return "succ";
//    }
    @Autowired
    private BikeServce bikeServce;


    @PostMapping("/bike")
    @ResponseBody  //响应Ajax请求，会将响应的对象转成json
    public String getById(@RequestBody Bike bike) {
        //调用Service保存map
        System.out.println(bike);
        bikeServce.save(bike);
        return "success";
    }

    @GetMapping("bikes")
    @ResponseBody
    public List<Bike> bikes(){

        return bikeServce.findBikes();
    }



}
