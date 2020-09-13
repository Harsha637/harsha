package com.bootmvctask.bootmvctask.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bootmvctask.bootmvctask.model.DxcUsers;

@Component
@Transactional
public class DxcUsersDao {

	@Autowired
	SessionFactory sessionFactory;

	public String saveUser(DxcUsers dxcUsers) {
		
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(dxcUsers);
			

			return "Successfully user created!!!!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("exception");
		}

		return "Sorry cannot create user";
	}

	public DxcUsers getUserInfo(int userId) {
		Session session = null;
		DxcUsers user = null;

		session = sessionFactory.getCurrentSession();
		user = session.get(DxcUsers.class, userId);
		System.out.println("User Data : "+user);
		
		return user;
	}
	 
	public DxcUsers getSecInfo(int userId) {
		Session session = null;
		DxcUsers user = null;
		session = sessionFactory.getCurrentSession();
		user = session.get(DxcUsers.class, userId);
		return user;
		
	}

	public void changePassword(String password,int userId) {
		DxcUsers user = null;
		Session session = null;
		
		user = getSecInfo(userId);
		user.setPassword(password);

		session = this.sessionFactory.getCurrentSession();
		
			session.update(user);
	}
	

	
}
