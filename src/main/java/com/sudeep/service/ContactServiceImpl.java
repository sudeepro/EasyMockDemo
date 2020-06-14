package com.sudeep.service;

import com.sudeep.dao.ContactDao;

public class ContactServiceImpl implements ContactService {

	private ContactDao dao;
	
	

	public void setDao(ContactDao dao) {
		this.dao = dao;
	}



	public String getNameById(Integer id) {

		return dao.getName(id); 
	}

}
