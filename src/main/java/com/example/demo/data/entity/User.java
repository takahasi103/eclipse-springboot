package com.example.demo.data.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity // このクラスをEntityとして使うためのアノテーション
@Data // Getter、Setterを省略するためのLombokのアノテーション
public class User {
	
	// userテーブルのid
	private Long id;

	// userテーブルのname
	private String name;

	// userテーブルのemail
	private String email;
}
