package com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Model.ShoppingMall;
import com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Service.ShoppingMallService;

@RestController
@RequestMapping("/users")
public class ShoppingMallController {
	
	@Autowired
	private ShoppingMallService smservice;
	
	
	@PostMapping("/addUser")
	public ShoppingMall addUser(@RequestBody ShoppingMall sm) {
		return smservice.addUser(sm);
		
	}

}
