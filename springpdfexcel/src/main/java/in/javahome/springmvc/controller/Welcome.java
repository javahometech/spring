package in.javahome.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
	@RequestMapping(value = "/welcome")
	public String hello() {
		String n = null;
		n.toUpperCase();
		return "welcome.jsp";
	}
}
