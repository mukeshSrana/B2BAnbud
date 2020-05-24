package org.b2b.anbud.controller;

import java.util.List;

import org.b2b.anbud.domain.Bedrift;
import org.b2b.anbud.domain.Product;
import org.b2b.anbud.service.ProductService;
import org.b2b.anbud.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
public class AppController {

    @Autowired
    private ProductService service;

    @Autowired
    private RegisterService registerService;

    @RequestMapping("/")
    public String viewMainPage(Model model) {
        return "main";
    }

    @RequestMapping("/register")
    public String viewRegisterPage(Model model) {
        Bedrift bedrift = new Bedrift();
        model.addAttribute("bedrift", bedrift);
        return "register";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("bedrift") Bedrift bedrift) {
        registerService.save(bedrift);
        return "redirect:/";
    }

    @RequestMapping("/product")
    public String viewHomePage(Model model) {
        List<Product> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "new_product";
    }
}

