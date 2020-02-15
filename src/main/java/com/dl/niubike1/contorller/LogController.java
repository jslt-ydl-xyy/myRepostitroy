package com.dl.niubike1.contorller;

import com.dl.niubike1.pojo.Log;
import com.dl.niubike1.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/log")
public class LogController {

    @Autowired
    LogService logService;

    @PostMapping("ready")
    @ResponseBody
    public String ready(@RequestBody Log log){
        logService.save(log);
        return "ok";
    }
}
