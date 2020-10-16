package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Cart;
import com.project.repository.CartRepository;
import com.project.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
    private CartRepository dao;
	@Override
	public Cart addCart(Cart cart) {
		return dao.save(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return dao.save(cart);
	}

	@Override
	public Cart getCartById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void deleteCartById(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<Cart> getAllCarts() {
		return dao.findAll();
	}

}
