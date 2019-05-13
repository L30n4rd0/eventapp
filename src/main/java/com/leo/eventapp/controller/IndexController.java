/**
 * 
 */
package com.leo.eventapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author leonardo
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		
//		return "index";
		return "redirect:/events";
		
	}

}
