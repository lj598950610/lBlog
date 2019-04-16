package com.lijun.lblog.service;

import java.util.List;

import com.lijun.lblog.domain.User;

/**
 * 
* Copyright: Copyright (c) 2019 lijun
* 
* @ClassName: UserService.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 李骏
* @date: 2019年4月15日 下午8:52:22 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月15日     Administrator           v1.0.0               修改原因
 */
public interface UserService {
	
	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	User saveUser(User user);
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	void removeUser(Long id);
	
	/**
	 * 删除列表里面的用户
	 * @param user
	 * @return
	 */
	void removeUsersInBatch(List<User> users);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	User updateUser(User user);
	
	/**
	 * 根据id获取用户
	 * @param user
	 * @return
	 */
	User getUserById(Long id);
	
	/**
	 * 获取用户列表
	 * @param user
	 * @return
	 */
	List<User> listUsers();
}
