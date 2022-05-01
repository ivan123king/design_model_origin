package com.dm.abstractfactory.demo01;

public class MotifWidgetFactory implements WidgetFactory{
	
	private Window window = null;
	
	private ScrollBar scrollBar = null;

	@Override
	public ScrollBar createScrollBar() {
		if(scrollBar==null) {
			scrollBar = new MotifScrollBar();
		}
		return scrollBar;
		
	}

	@Override
	public Window createWindow() {
		if(window==null) {
			window = new MotifWindow();
		}
		return window;
	}

}
