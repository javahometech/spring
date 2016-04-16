package in.javahome.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.javahome.springmvc.model.Register;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String viewRegister(ModelMap map) {
		map.addAttribute("reg", new Register());
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@Valid  Register r, BindingResult result, ModelMap map) {
		
		if(result.hasErrors()){
			System.out.println("hasErrors is true");
			map.addAttribute("reg", r);
			return "register";
		}
		
		System.out.println("Name "+r.getName());
		System.out.println("Phone "+r.getPhone());
		System.out.println("Course "+r.getCourse());
		System.out.println("Dear, "+r.getName()+" You are successfullly registered");
		return "success";
	}
	
}
