package com.stackroute;

import com.stackroute.service.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
    @RequestMapping("/login")
    public ModelAndView login(@ModelAttribute("name") User user) {

        //u.setName(name);
       // u.setPassword(password);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",user.getName());
        return mv;
    }
}
