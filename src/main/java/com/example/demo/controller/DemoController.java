package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    @GetMapping("/getDemo")
    @ResponseBody
    public String GetADemo(){
        log.atWarn().addKeyValue("key1","value1").addKeyValue("key2","value2").log("fewfwef");
        log.error("ffff");
        return "demo";
    }
}
