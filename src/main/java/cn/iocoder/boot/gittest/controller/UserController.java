package cn.iocoder.boot.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Axing
 * @description: 用户控制器
 */
@RestController("user")
public class UserController {

    @GetMapping
    public String getUser() {
        return "Axing";
    }

    @GetMapping("get")
    public String getUser2() {
        return "Axing";
    }
    //  lalala
}
