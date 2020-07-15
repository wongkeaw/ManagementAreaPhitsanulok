/**
 * 
 */
package aran.tech.map.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import aran.tech.map.domain.User;

/**
 * @author oawon
 *
 */
@Controller
@RequestMapping("/")
public class UserController {

	/**
	 * 
	 */
	public UserController() {
		// TODO Auto-generated constructor stub

	}

	@RequestMapping("login")
	public String getuser(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView login(User user){
		System.out.println(user);
        return new ModelAndView("redirect:/");
    }
	
}
