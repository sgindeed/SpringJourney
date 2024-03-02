package com.seleniumexpress.ioc;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("calling using VI");
		
	}

	@Override
	public void data() {
		System.out.println("browsing using VI");
		
	}

	
}
