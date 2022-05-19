package com.dm.bridge.demo01;

public class TransientWindow extends Window{
	
	public TransientWindow(WindowImp windowImp){
		super(windowImp);
	}

	/**
	 * 绘制窗口
	 */
	public void drawCloseBox(){
		//绘制图形
		this.drawRect();
	}

	@Override
	public void drawWindow() {
		this.drawCloseBox();
	}

}
