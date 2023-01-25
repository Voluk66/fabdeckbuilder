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

    @RequestMapping(value = "nonClasse", method = RequestMethod.GET)
    public ModelAndView nonClasse(){
        ModelAndView mv = new ModelAndView("nonClasse");
        return mv;
    }

    @RequestMapping(value = "generic", method = RequestMethod.GET)
    public ModelAndView generic(){
        ModelAndView mv = new ModelAndView("generic");
        return mv;
    }

    @RequestMapping(value = "assassin", method = RequestMethod.GET)
    public ModelAndView assassin(){
        ModelAndView mv = new ModelAndView("assassin");
        return mv;
    }

    @RequestMapping(value = "brute", method = RequestMethod.GET)
    public ModelAndView brute(){
        ModelAndView mv = new ModelAndView("brute");
        return mv;
    }

    @RequestMapping(value = "guardian", method = RequestMethod.GET)
    public ModelAndView guardian(){
        ModelAndView mv = new ModelAndView("guardian");
        return mv;
    }

    @RequestMapping(value = "illusionist", method = RequestMethod.GET)
    public ModelAndView illusionist(){
        ModelAndView mv = new ModelAndView("illusionist");
        return mv;
    }

    @RequestMapping(value = "mechanologist", method = RequestMethod.GET)
    public ModelAndView mechanologist(){
        ModelAndView mv = new ModelAndView("mechanologist");
        return mv;
    }

    @RequestMapping(value = "merchant", method = RequestMethod.GET)
    public ModelAndView merchant(){
        ModelAndView mv = new ModelAndView("merchant");
        return mv;
    }

    @RequestMapping(value = "ninja", method = RequestMethod.GET)
    public ModelAndView ninja(){
        ModelAndView mv = new ModelAndView("ninja");
        return mv;
    }
    @RequestMapping(value = "ranger", method = RequestMethod.GET)
    public ModelAndView ranger(){
        ModelAndView mv = new ModelAndView("ranger");
        return mv;
    }

    @RequestMapping(value = "runeblade", method = RequestMethod.GET)
    public ModelAndView runeblade(){
        ModelAndView mv = new ModelAndView("runeblade");
        return mv;
    }

    @RequestMapping(value = "shapeshifter", method = RequestMethod.GET)
    public ModelAndView shapeshifter(){
        ModelAndView mv = new ModelAndView("shapeshifter");
        return mv;
    }

    @RequestMapping(value = "warrior", method = RequestMethod.GET)
    public ModelAndView warrior(){
        ModelAndView mv = new ModelAndView("warrior");
        return mv;
    }

    @RequestMapping(value = "wizard", method = RequestMethod.GET)
    public ModelAndView wizard(){
        ModelAndView mv = new ModelAndView("wizard");
        return mv;
    }
}
