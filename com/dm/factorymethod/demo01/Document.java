package com.dm.factorymethod.demo01;

/**
 * 文档接口
 * @author Administrator
 *
 */
public interface Document {

	public void open();
	
	public void close();
	
	public void save();
	
	public void revert();
}
