package com.lijun.lblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lijun.lblog.service.UserService;

/**
 * 
* Copyright: Copyright (c) 2019 lijun
* 
* @ClassName: UserController.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 李骏
* @date: 2019年4月15日 下午8:53:05 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月15日     Administrator           v1.0.0               修改原因
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 查询所用用户
	 * @return
	 */
	@GetMapping
	public ModelAndView listAll(Model model) {
		model.addAttribute("userList", userService.listUsers());
		return new ModelAndView("index", "userModel", model);
	}
	
}
