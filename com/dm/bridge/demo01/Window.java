package com.dm.bridge.demo01;

/**
 * 窗口
 * 
 * @author Administrator
 *
 */
public abstract class Window {

	public WindowImp windowImp;
	
	public Window(WindowImp windowImp){
		this.windowImp = windowImp;
	}
	
	/**
	 * UML图上并没有此方法，
	 * 是为了符合java多态设计的方法
	 */
	public abstract void drawWindow();
	
	/**
	 * 绘制内容
	 */
	public void drawText(){
		this.windowImp.devDrawText();
	}

	/**
	 * 绘制图形
	 */
	public void drawRect(){
		this.windowImp.devDrawLine();
	}
}
