package com.sudeep.service;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.sudeep.dao.ContactDao;

public class ContactServiceTest {
	@Test
	public void testGetNameById_01() {
		
		// Creating Proxy
		ContactDao daoProxy = EasyMock.createMock(ContactDao.class);

		// setting behaviour for proxy
		EasyMock.expect(daoProxy.getName(101))
				.andReturn("Sudeep");
		EasyMock.expect(daoProxy.getName(102))
				.andReturn("sudeep sharma");
		EasyMock.replay(daoProxy);
		ContactServiceImpl contactService = new ContactServiceImpl();
		contactService.setDao(daoProxy);
		String nameById = contactService.getNameById(101);
		assertNotNull(nameById);
	}

}
