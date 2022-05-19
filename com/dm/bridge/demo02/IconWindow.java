package com.dm.bridge.demo02;

public class IconWindow implements Window{
	
	public WindowImp windowImp;
	
	public IconWindow(WindowImp windowImp){
		this.windowImp = windowImp;
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

	@Override
	public void drawText() {
		this.windowImp.drawText();
	}

	@Override
	public void drawRect() {
		this.windowImp.drawRect();
	}
}
