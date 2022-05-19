package com.dm.bridge.demo01;

public class IconWindow extends Window{
	
	public IconWindow(WindowImp windowImp){
		super(windowImp);
	}
	
	/**
	 * 绘制窗口
	 */
	public void drawBorder(){
		//绘制图形
		this.drawRect();
		//绘制内容
		this.drawText();
	}

	@Override
	public void drawWindow() {
		this.drawBorder();
	}
}
