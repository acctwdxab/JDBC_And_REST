package com.quintrix.jfs2.demo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class sayHello {

	
//		Post method
		@PostMapping("/sayhello")
		public Hello hello () {

			Hello h = new Hello();
			h.setFirstName("Nancy");
			h.setLastName("Lee");
			return h;
	}
	}

	


