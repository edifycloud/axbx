package net.sk32.axbx.ums.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询用户信息接口
 */
@RestController
@RequestMapping(path = "user")
public class UmsUserController {
    @GetMapping
    public List<Integer> getAllUser() {
        List<Integer> list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            list.add(i + 1000);
        }
        return list;
    }

    @GetMapping(path = "{id}")
    public String getUserById(@PathVariable Long id) {
        return "Account:" + id;
    }
}
