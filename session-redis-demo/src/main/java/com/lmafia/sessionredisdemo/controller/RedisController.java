package com.lmafia.sessionredisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author L_MaFia
 * @classname RedisController.java
 * @description TODO
 * @date 2021/4/11
 */

@RestController
@RequestMapping(value = "/session")
public class RedisController {

    @Value("${server.port}")
    String port;



    @GetMapping(value = "/set/{name}")
    public String set(@PathVariable("name") String name, HttpSession session){
        session.setAttribute("name",name);
        return String.valueOf(port);
    }


    @GetMapping("/get")
    public String get(HttpSession session) {
        String name = (String) session.getAttribute("name");
        System.out.println(name + port);
        return name + port;
    }
}
