package be.ehb.demo_opdracht.controllers;


import be.ehb.demo_opdracht.model.Product;
import be.ehb.demo_opdracht.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @Autowired
    ProductDAO dao;

    @ModelAttribute(value = "all")
    public Iterable<Product> findAll(){
        return dao.findAll();
    }
    @RequestMapping(value = {"/","/index"},method= RequestMethod.GET)
    public String showIndex(ModelMap map){
        return "index";
    }
}
