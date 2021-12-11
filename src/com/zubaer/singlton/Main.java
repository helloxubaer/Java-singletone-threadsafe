package com.zubaer.singlton;


public class Main {

	public static void main(String[] args) {
		//Singletone instance = Singletone.getInstance();
		//instance.fromSingleton();
		
		//Singletone instance2 = Singletone.getInstance();
		//instance2.fromSingleton();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singletone instance = Singletone.getInstance();
				instance.fromSingleton();
				
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singletone instance = Singletone.getInstance();
				instance.fromSingleton();
				
			}
		});
		t2.start();

	}

}
