package com.app.singleton;

public class SingletonApp {

	static SingletonApp singletonApp;



	public static SingletonApp getapp() {
		if (singletonApp == null) {
			singletonApp = new SingletonApp();
		}
		return singletonApp;
	}

	public void getprint() {
		System.out.println("this is printer method in printer ???/?????");
	}
}
