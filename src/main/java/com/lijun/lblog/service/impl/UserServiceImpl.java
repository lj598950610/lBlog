package com.lijun.lblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lijun.lblog.domain.User;
import com.lijun.lblog.repository.UserRepository;
import com.lijun.lblog.service.UserService;

/**
 * 
* Copyright: Copyright (c) 2019 lijun
* 
* @ClassName: UserServiceImpl.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 李骏
* @date: 2019年4月15日 下午8:55:05 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月15日     Administrator           v1.0.0               修改原因
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Transactional
	@Override
	public User saveUser(User user) {
		
		User user2 = new User();
		return userRepository.save(user);
	}

	@Transactional
	@Override
	public void removeUser(Long id) {
		userRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void removeUsersInBatch(List<User> users) {
		userRepository.deleteAll(users);
		
	}

	@Transactional
	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Transactional
	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	@Transactional
	@Override
	public List<User> listUsers() {
		return userRepository.findAll();
	}

}
