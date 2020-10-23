package com.zmm.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Name HelloController
 * @Author 900045
 * @Created by 2020/10/23 0023
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String sayHello(){
		//修改返回的字符串的内容
		return "第1次调试! Hello jenkins, " + new Date();
	}
}
