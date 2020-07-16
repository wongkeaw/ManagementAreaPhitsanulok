/**
 * 
 */
package aran.tech.map.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aran.tech.map.domain.SubArea;
import aran.tech.map.services.SubAreaService;

/**
 * @author oawon
 *
 */
@Controller
@RequestMapping("/subarea")
public class SubAreaController {

	/**
	 * 
	 */
	@Autowired
	SubAreaService subAreaService ; 

    @RequestMapping("/{id}")
    public String showShop(@PathVariable Long id, Model model){
    	SubArea  subarea  = subAreaService.findbyId(id) ;
    	
        model.addAttribute("subarea", subarea);
        return "subareashow";
    }

}
