package com.dm.adapter.demo01;

/**
 * 图形界面
 * @author Administrator
 *
 */
public interface Shape {
	
	/**
	 * 弹框
	 */
	String boundingBox();
	
	/**
	 * 创建操作者
	 */
	Manipulator createManipulator();
	
}
