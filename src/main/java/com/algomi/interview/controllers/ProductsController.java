package com.algomi.interview.controllers;

import com.algomi.interview.domain.ProductsIO;
import com.algomi.interview.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @Autowired
    private ProductsService service;

    @RequestMapping(value = "/products/", method = RequestMethod.GET)
    @ResponseBody
    public ProductsIO products() {
        return service.getProducts();
    }
}
