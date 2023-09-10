package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	// @RequestMapping(path = "/user", method = RequestMethod.GET)の省略版。
	// HTTPのメソッドGETのみ受け付けます。
	@GetMapping("/users")
	public String getUsers() {

		// テンプレートは src/main/resources/templates/users.html とします。
		return "users";
	}
}
