package com.inhatc.mj;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		
		return "login";
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		
		return "main";
	}
	
	@RequestMapping(value = "/no_list", method = RequestMethod.GET)
	public String no_list(Locale locale, Model model) {
		
		return "/notice/no_list";
	}
	
	@RequestMapping(value = "/no_write", method = RequestMethod.GET)
	public String no_write(Locale locale, Model model) {
		
		return "/notice/no_write";
	}
	
	@RequestMapping(value = "/pro_list", method = RequestMethod.GET)
	public String pro_list(Locale locale, Model model) {
		
		return "/project/pro_list";
	}
	
	@RequestMapping(value = "/pro_write", method = RequestMethod.GET)
	public String pro_write(Locale locale, Model model) {
		
		return "/project/pro_write";
	}
}
