package com.colin.sports.core.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by colinx on 2017/3/17.
 */
@Controller
public class PotalAction {

    @RequestMapping("/test.do")
    public String test(){

        return "test";
    }
}
