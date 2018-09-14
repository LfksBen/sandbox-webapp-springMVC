package com.bbr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String findAll() {
        return "Hello !";
    }

}
