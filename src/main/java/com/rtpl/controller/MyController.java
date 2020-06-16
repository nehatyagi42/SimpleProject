package com.rtpl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/displayinfo")
public String findinfo() {
	return "learnspringboot";
}

	/*
	 * // whenever request is came /controllerinfo just execute this controllerfind
	 * method and return learnspringboot string
	 */




	
	
}


