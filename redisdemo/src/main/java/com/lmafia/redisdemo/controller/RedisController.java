package com.lmafia.redisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author L_MaFia
 * @classname RedisController.java
 * @description TODO
 * @date 2021/4/11
 */

@RestController
@RequestMapping(value = "/redis")
public class RedisController {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = "/set/{name}")
    public void set(@PathVariable("name") String name){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("name",name);
    }


    @GetMapping("/get")
    public String get() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String name = ops.get("name");
        System.out.println(name);
        return name;
    }
}
