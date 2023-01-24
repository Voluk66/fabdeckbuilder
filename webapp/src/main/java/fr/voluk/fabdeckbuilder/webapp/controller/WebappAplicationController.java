package fr.voluk.fabdeckbuilder.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebappAplicationController {
    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping(value = "/cartes", method = RequestMethod.GET)
    public ModelAndView cartes(){
        ModelAndView mv = new ModelAndView("cartes");
        return mv;
    }

}
