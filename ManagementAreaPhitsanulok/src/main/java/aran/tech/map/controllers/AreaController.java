package aran.tech.map.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aran.tech.map.domain.Area;
import aran.tech.map.services.AreaService;

@Controller
@RequestMapping("/area")
public class AreaController {
	
	@Autowired
	AreaService areaService ;
	
	@RequestMapping("/{id}")
    public String showArea(@PathVariable Long id, Model model){
    	Area  area  = areaService.findById(id) ;
    	
        model.addAttribute("area", area);
        return "areashow";
    }

}
