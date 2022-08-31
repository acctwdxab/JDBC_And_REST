package com.quintrix.jfs2.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
//	Get method
	@GetMapping("/hello")
	public String HelloWorld() {

		return "Hello World";
}


}
