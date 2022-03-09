package com.newnew.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Item {
	
	@Id
	private int item_id;
	public int getItem_id() {
		return item_id;
	}
	@ManyToMany
	private List<Cart> cart;
	public List<Cart> getCart() {
		return cart;
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	String item_desc;
	public String getItem_desc() {
		return item_desc;
	}
	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	private int item_price;
public Item() {
	super();
}
public Item(int item_id,int item_price, String item_desc) {
	super();
	this.item_id=item_id;
	this.item_desc=item_desc;
	this.item_price=item_price;
}
}
