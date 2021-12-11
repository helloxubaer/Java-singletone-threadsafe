package com.zubaer.singlton;

public final class Singletone {
	
	private static Singletone singletoneInstance;
	
	private Singletone() {
		
	}
	
	public synchronized static Singletone getInstance() {
		if(singletoneInstance == null) {
			
			singletoneInstance=  new Singletone();
			System.out.println("First object created!");
		}
		return singletoneInstance;
	}
	
	public void fromSingleton() {
		System.out.println("Instace created!");
	}

}
