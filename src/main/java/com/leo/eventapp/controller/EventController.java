/**
 * 
 */
package com.leo.eventapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.leo.eventapp.model.Event;
import com.leo.eventapp.repository.EventRepository;

/**
 * @author leonardo
 *
 */
@Controller
public class EventController {
	
	@Autowired
	private EventRepository eventRepository;
	
	@RequestMapping(value="/registerEvent", method=RequestMethod.GET)
	public String eventForm() {
		
		return "event/eventForm";
		
	}
	
	@RequestMapping(value="/registerEvent", method=RequestMethod.POST)
	public String eventForm(Event event) {
		
		eventRepository.save(event);
		
		return "redirect:/registerEvent";
		
	}
	
	@RequestMapping("/events")
	public ModelAndView eventList() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		Iterable<Event> events = eventRepository.findAll();
		
		// The first attribute is defined on index.html file
		modelAndView.addObject("events", events);
		
		return modelAndView;
		
	}

}
