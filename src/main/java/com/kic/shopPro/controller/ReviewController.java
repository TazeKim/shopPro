package com.kic.shopPro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReviewController {

	
	@RequestMapping(value="/ReviewWrite", method=RequestMethod.GET)
	public String reviewWriteGetMethod() {
		return "board/review/reviewWrite";
	}
}
