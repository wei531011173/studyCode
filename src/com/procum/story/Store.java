package com.procum.story;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	public static final int MAX_SIZE = 10;
	
	List<Integer> products = new ArrayList<Integer>();
	
	public synchronized void get(){
		
		try {
			if(this.products.size() <= 0)
				this.wait();
			int p = this.products.remove(0);
			System.out.println("consume:" + p);
			this.notifyAll();
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void put(){
		
		try {
			if(this.products.size() >= MAX_SIZE)
				this.wait();
			int p = products.size() + 1;
			this.products.add(p);
			System.out.println("produce:" + p);
			this.notifyAll();
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
