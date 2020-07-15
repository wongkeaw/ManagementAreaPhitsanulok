package aran.tech.map.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aran.tech.map.domain.Shop;
import aran.tech.map.services.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {

	@Autowired
	ShopService shopService ;
	
    @RequestMapping("/{id}")
    public String showProduct(@PathVariable Long id, Model model){
    	Shop  shop  = shopService.findbyId(id) ;
    	
        model.addAttribute("shop", shop);
        return "shopshow";
    }
}
