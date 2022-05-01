package com.dm.abstractfactory.demo01;

public class PMWidgetFactory implements WidgetFactory {

	private Window window = null;

	private ScrollBar scrollBar = null;

	@Override
	public ScrollBar createScrollBar() {
		if (scrollBar == null) {
			scrollBar = new PMScrollBar();
		}
		return scrollBar;

	}

	@Override
	public Window createWindow() {
		if (window == null) {
			window = new PMWindow();
		}
		return window;
	}

}
