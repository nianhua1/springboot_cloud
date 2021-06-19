package com.teng.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2021-06-19 14:55
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String userName){
        String template = restTemplate.getForObject("http://PROVIDE-TICKET/ticket", String.class);
        return userName+"买到了"+template+"票";
    }
}
