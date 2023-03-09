package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate template;

	@Transactional
	public int saveUser(User user) {
		int id = (Integer) this.template.save(user);
		return id;
	}

}
