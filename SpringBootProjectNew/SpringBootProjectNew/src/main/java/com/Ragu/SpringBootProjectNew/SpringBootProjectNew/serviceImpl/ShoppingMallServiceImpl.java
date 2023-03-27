package com.Ragu.SpringBootProjectNew.SpringBootProjectNew.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Model.ShoppingMall;
import com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Repository.ShoppingMallRepository;
import com.Ragu.SpringBootProjectNew.SpringBootProjectNew.Service.ShoppingMallService;


@Service
public class ShoppingMallServiceImpl implements ShoppingMallService {
	
	@Autowired
	private ShoppingMallRepository shoppingMallRepository;
	
	@Override
	public ShoppingMall  addUser(ShoppingMall sm) {
		return shoppingMallRepository.save(sm);
	}

}
