package com.abc.openlaw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.abc.openlaw.service.LawService;

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
/*
    Law aLaw = new Law("ley 1");
    aLaw.addArticle(new Article("Articulo 1").addItem(new Item("Inciso 1")).addItem(new Item("Inciso 2")))
            .addArticle(new Article("Articulo 2"));
            */
}
