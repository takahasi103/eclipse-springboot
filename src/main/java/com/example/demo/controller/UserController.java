package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.data.entity.User;
import com.example.demo.data.repository.UserRepository;

@Controller
public class UserController {
	// @Autowiredアノテーションを付けると、Spring Bootが自動でインスタンスをInjectします。
	@Autowired
	private UserRepository userRepository;
	
	// @RequestMapping(path = "/user", method = RequestMethod.GET)の省略版。
	// HTTPのメソッドGETのみ受け付けます。
	@GetMapping("/users")
	public String getUsers() {
		// ユーザーリスト取得処理を追加
		List<User> users = userRepository.findAll();
		// テンプレートは src/main/resources/templates/users.html とします。
		return "users";
	}
}
