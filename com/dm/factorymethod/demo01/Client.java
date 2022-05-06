package com.dm.factorymethod.demo01;

public class Client {
	
	public static void main(String[] args) {
		Application app = new MyApplication();
		app.newDocument();
	}

}
