package com.lijun.lblog.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lijun.lblog.domain.User;
import com.lijun.lblog.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserTestController {
	
	@Autowired
	private UserService userService;

	@Test
	public void testUser() {
		User user = new User();
		user.setName("lijun");
		user.setPassword("lijun");
		userService.saveUser(user);
	    System.out.println(userService.updateUser(user).toString());
	}
}