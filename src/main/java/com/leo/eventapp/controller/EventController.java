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
public class EventController {
	
	@RequestMapping("/registerEvent")
	public String eventForm() {
		
		return "event/eventForm";
		
	}

}
