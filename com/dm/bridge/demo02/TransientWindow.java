package com.dm.bridge.demo02;

public class TransientWindow implements Window {

	public WindowImp windowImp;

	public TransientWindow(WindowImp windowImp) {
		this.windowImp = windowImp;
	}

	/**
	 * 绘制窗口
	 */
	public void drawCloseBox() {
		// 绘制图形
		this.drawRect();
	}

	@Override
	public void drawWindow() {
		this.drawCloseBox();
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
