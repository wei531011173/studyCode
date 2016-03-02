package com.procum;

import com.procum.consume.Consume;
import com.procum.produce.Producer;
import com.procum.story.Store;

public class TestMain {
	
	public static void main(String[] args) {
		
		Store store = new Store();
		
		new Producer(store).start();
		
		new Consume(store).start();
	}

}
