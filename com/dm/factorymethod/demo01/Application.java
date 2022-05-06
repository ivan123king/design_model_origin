package com.dm.factorymethod.demo01;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {

	List<Document> docs = new ArrayList<>();
	
	/**
	 * 推迟到子类中实现的方法
	 * 这个方法就是抽象工厂方法，用于返回一个对象
	 * @return
	 */
	public abstract Document createDocument();
	
	public void newDocument(){
		Document doc = this.createDocument();
		this.docs.add(doc);
		this.openDocument(doc);
	}
	
	public void openDocument(Document document){
		document.open();
	}
}
