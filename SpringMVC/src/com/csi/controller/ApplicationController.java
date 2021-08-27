package com.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class ApplicationController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap modelMap) {
		modelMap.addAttribute("message", "WELCOME TO CSI PUNE");

		return "welcome";

	}

	@RequestMapping(value = "/csiservices", method = RequestMethod.GET)
	public String csiServices(ModelMap modelMap) {

		modelMap.addAttribute("message", "APPLICATION SOFTWARE DEVELOPMENT | PAYMENT GETWAY INTEGRATION SERVICE");

		return "fullstack";

	}

	@RequestMapping(value = "/csiaddress", method = RequestMethod.GET)
	public String csiAddress(ModelMap modelMap) {

		modelMap.addAttribute("message", "INSPIRIA MALL ,PCMC,MH,INDIA");

		return "address";

	}

	@RequestMapping(value = "/fullStack", method = RequestMethod.GET)
	public String sayFullStack(ModelMap modelMap) {

		modelMap.addAttribute("message", "WELCOME TO CENTERAL BANK");

		return "centeral";

	}

}
