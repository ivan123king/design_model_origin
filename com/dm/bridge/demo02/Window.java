package com.dm.bridge.demo02;

/**
 * 窗口
 * 
 * @author Administrator
 *
 */
public interface Window {

	
	/**
	 * UML图上并没有此方法，
	 * 是为了符合java多态设计的方法
	 */
	public void drawWindow();
	
	/**
	 * 绘制内容
	 */
	public void drawText();

	/**
	 * 绘制图形
	 */
	public void drawRect();
}
