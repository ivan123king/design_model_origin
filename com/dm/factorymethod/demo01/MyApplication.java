package com.dm.factorymethod.demo01;

public class MyApplication extends Application{

	/**
	 * 此处就是抽象工厂方法
	 * 它构建一个产品，并返回
	 */
	@Override
	public Document createDocument() {
		return new MyDocument();
	}

}
