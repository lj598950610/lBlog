package com.lijun.lblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lijun.lblog.domain.User;

/**
 * 
* Copyright: Copyright (c) 2019 lijun
* 
* @ClassName: UserRepository.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 李骏
* @date: 2019年4月15日 下午8:52:31 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月15日     Administrator           v1.0.0               修改原因
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
