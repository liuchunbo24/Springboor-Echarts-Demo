package com.echarts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/3.
 */
@Controller
public class TestController {
    @RequestMapping("/testEcharts")
    public String test(){
        return "test";
    }
}
