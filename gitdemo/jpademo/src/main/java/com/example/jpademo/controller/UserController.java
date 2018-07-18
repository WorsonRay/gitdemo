package com.example.jpademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpademo.pojo.ActivityAttachfile;
import com.example.jpademo.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	//测试插入新的数据
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		
		ActivityAttachfile n = new ActivityAttachfile();
		n.setId(1003);
		n.setAttachId(1);
		n.setInfoId(1);
		userRepository.save(n);
		return "保存成功";
	}
	
	//测试获取全部的数据
	@GetMapping(path="/all")
	public Iterable<ActivityAttachfile> getAllUsers() {
		return userRepository.findAll();
	}
}
