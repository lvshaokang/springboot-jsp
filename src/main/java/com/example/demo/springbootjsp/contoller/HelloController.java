package com.example.demo.springbootjsp.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author lsk
 * @class_name HelloController
 * @date 2019/2/20
 */
@Controller
public class HelloController {

    @GetMapping("/index")
    public String fun(){
        return "index";
    }
}
