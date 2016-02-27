package com.procum.produce;

import com.procum.story.Store;

/**
 * 生产者类
 * @author wy
 *
 */
public class Producer extends Thread{
	
	private Store store;
	
	public Producer(Store store) {
		
		this.store = store;
		
	}
	
	
	@Override
    public void run() {
		int i = 0;
        while(i < 10) {
        	store.put();
        	i++;
        }
    }

}
