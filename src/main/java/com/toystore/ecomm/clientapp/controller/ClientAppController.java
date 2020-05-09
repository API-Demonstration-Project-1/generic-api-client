package com.toystore.ecomm.clientapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toystore.ecomm.clientapp.client.UserManagementServiceDiscoveryClient;
import com.toystore.ecomm.clientapp.model.User;

@RestController
@RequestMapping(value="test")
public class ClientAppController {
	
	@Autowired
	UserManagementServiceDiscoveryClient client;
	
	@RequestMapping(value="/{userId}",method = RequestMethod.GET)
	public User getUserById(@PathVariable("userId") String userId) {
		return client.getUser(userId);
	}

}
