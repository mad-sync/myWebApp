package com.example.myWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home")
//    public ModelAndView home(@RequestParam("name") String myName){
      public ModelAndView home(Alien alien){

        ModelAndView mv = new ModelAndView();
//        System.out.println(myName);
        mv.addObject("obj" , alien);
        mv.setViewName("home");

        return mv;
    }
}
