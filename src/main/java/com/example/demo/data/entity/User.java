package com.example.demo.data.entity;


import lombok.Data;

@Data // Getter、Setterを省略するためのLombokのアノテーション
public class User {
	
	private Long id;

	private String name;

	private String email;
}
