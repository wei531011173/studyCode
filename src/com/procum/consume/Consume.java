package com.procum.consume;

import com.procum.story.Store;

/**
 * 消费者类
 * @author wy
 *
 */
public class Consume extends Thread{
	
	private Store store;
	
	
	public Consume(Store store) {
		
		this.store = store;
	}
	
	@Override
	public void run() {
		int i = 0;
        while(i < 10) {
        	store.get();
        	i++;
        }
			
	}
	
	
	
	

}
