package net.sk32.axbx.ums.controller;

import net.sk32.axbx.ums.vo.UserVO;
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
    public List<UserVO> getAllUser() {
        List<UserVO> list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            UserVO vo = new UserVO();
            vo.setId(i + 1000L);
            vo.setName("u-fake-" + i);
            vo.setRole("S");
            list.add(vo);
        }
        return list;
    }

    @GetMapping(path = "{id}")
    public String getUserById(@PathVariable Long id) {
        return "Account:" + id;
    }
}
