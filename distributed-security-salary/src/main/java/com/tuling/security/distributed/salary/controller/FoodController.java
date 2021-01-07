package com.tuling.security.distributed.salary.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
public class FoodController {

    @GetMapping("query")
    @PreAuthorize("hasAuthority('food')")//需要授权客户端拥有order资源才可以访问。
    public String query(){
        return "food info";
    }
}
