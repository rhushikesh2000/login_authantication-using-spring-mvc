package com.rush;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {
	@RequestMapping("/add")
	public void name() {
		System.out.println("i am here");
	}
	

}
