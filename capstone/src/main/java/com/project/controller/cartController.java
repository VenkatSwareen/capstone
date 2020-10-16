package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Cart;
import com.project.service.CartService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class cartController {

	@Autowired
    private CartService service;
	
    @PostMapping("/cart")
    public Cart addCart(@RequestBody Cart cart) {
	return service.addCart(cart);
   }
    @PutMapping("/cart")
    public Cart updateCart(@RequestBody Cart cart) {
	return service.updateCart(cart);
	
   }
    @GetMapping("/cart/{id}")
    public Cart getCartById(@PathVariable int id) {
    return service.getCartById(id);
   }
    @DeleteMapping("/cart/{id}")
    public void deleteCartById(@PathVariable int id) {
    service.deleteCartById(id);
   }
    @GetMapping("/carts")
    public List<Cart>getAllCarts(){
    return service.getAllCarts();
   }
}