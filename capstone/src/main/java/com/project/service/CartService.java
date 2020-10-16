package com.project.service;

import java.util.List;

import com.project.model.Cart;

public interface CartService {

	public Cart addCart(Cart cart);
	public Cart updateCart(Cart cart);
	public Cart getCartById(int id);
	public void deleteCartById(int id);
	public List<Cart>getAllCarts();
}
