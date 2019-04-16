package com.lijun.lblog.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 * 
* Copyright: Copyright (c) 2019 lijun
* 
* @ClassName: User.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 李骏
* @date: 2019年4月15日 下午8:52:58 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月15日     Administrator           v1.0.0               修改原因
 */
@Entity
@Data
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id // 主键
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
	private Long id; // 用户的唯一标识
	
	@javax.validation.constraints.NotEmpty
	@Size(min=2, max=20)
	@Column(nullable = false, length = 20) // 映射为字段，值不能为空
	private String name;
	
	@javax.validation.constraints.NotEmpty
	@Size(max=100)
	@Column(length = 100)
	private String password;

}
