package com.abc.openlaw.controller;

import com.abc.openlaw.controller.commands.LawCommand;
import com.abc.openlaw.domain.LawVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.abc.openlaw.service.LawService;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by scamisay on 05/02/16.
 */
@Controller
@RequestMapping(value = "/law")
public class LawController {

    @Autowired
    private LawService lawService;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view() {
        return "law/view";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("law/create");
        mav.addObject("law", new LawCommand());
        return mav;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(LawCommand lawCommand){
        //communitationService.save(metric);
        return "redirect:/law/create";
    }
/*
    LawVersion aLaw = new LawVersion("ley 1");
    aLaw.addArticle(new Article("Articulo 1").addItem(new Item("Inciso 1")).addItem(new Item("Inciso 2")))
            .addArticle(new Article("Articulo 2"));
            */
}
