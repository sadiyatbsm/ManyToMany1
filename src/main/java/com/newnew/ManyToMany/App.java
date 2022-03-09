package com.newnew.ManyToMany;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
      	
    	Session ses= factory.openSession();
    	Item item1=new Item();
    	item1.setItem_id(1);
    	item1.setItem_desc("pencil");
    	item1.setItem_price(10);
    	
    	Item item2=new Item();
    	item2.setItem_id(2);
    	item2.setItem_desc("scale");
    	item2.setItem_price(20);
    	
    	List<Item> l1=new ArrayList<Item>();
    	l1.add(item1);
    	l1.add(item2);
    	
    	Cart cart1= new Cart();
    	cart1.setCart_id(101);
    	cart1.setCart_total(100);
    	
    	
    	Cart cart2= new Cart();
    	cart1.setCart_id(102);
    	cart1.setCart_total(80);
    	
    	
    	List<Cart> l2=new ArrayList<Cart>();
    	l2.add(cart1);
    	l2.add(cart2);
    	cart1.setItem(l1);
    	item1.setCart(l2);
    	
    	
    Transaction tx=ses.beginTransaction();
    	ses.save(cart1);
    	ses.save(cart2);
    	ses.save(item1);
    	ses.save(item2);
    	
    	tx.commit();
    	ses.close();
    	factory.close();
    	
    	
    }
}
