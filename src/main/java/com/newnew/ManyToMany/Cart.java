package com.newnew.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Cart {

	@Id
	private int cart_id;
	public int getCart_id() {
		return cart_id;
	}
	@ManyToMany
	private List<Item> item;
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getCart_total() {
		return cart_total;
	}
	public void setCart_total(int cart_total) {
		this.cart_total = cart_total;
	}
	private int cart_total;
	public Cart() {
		super();
	}
	public Cart(int cart_id,int cart_total) {
		super();
		this.cart_id=cart_id;
		this.cart_total=cart_total;
	}
		// TODO Auto-generated method stub
		
	}
	

