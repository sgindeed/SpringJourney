package com.seleniumexpress.ioc;

public class Airtel implements Sim {
	
	@Override
	public void calling() {
		System.out.println("calling using Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("browsing using Airtel");
		
	}

	
}
