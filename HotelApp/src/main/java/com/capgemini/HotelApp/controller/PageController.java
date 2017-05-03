package com.capgemini.HotelApp.controller;

import com.capgemini.HotelApp.model.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by EHEIJDEN on 3-5-2017.
 */

@RestController
public class PageController {
    @RequestMapping(value = "/api/page", method = RequestMethod.GET)
    public Page pagina() {
        Page page = new Page();
        page.setTitle("Wordpress document");
        page.setContent("Saaie blogs");
        return page;
    }
}

