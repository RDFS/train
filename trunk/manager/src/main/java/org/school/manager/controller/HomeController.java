package org.school.manager.controller;

import com.alibaba.fastjson.JSON;
import org.school.manager.model.entity.UUIDEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * Created by lyrics on 2017/2/27.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value = "/")
    public String Index() {
        return "index";
    }

    @RequestMapping(value = "login.do")
    public String Login() {
        return "login";
    }

    @RequestMapping("uuid.do")
    @ResponseBody
    public String GetUUID() {
        UUID uuid = UUID.randomUUID();
        String code = uuid.toString();
        UUIDEntity uuidEntity = new UUIDEntity();
        uuidEntity.setUuid(code);
        return JSON.toJSONString(uuidEntity);
    }
}
