package com.dm.abstractfactory.demo01;

/**
 * 抽象工厂
 * @author Administrator
 *
 */
public interface WidgetFactory {
	
	/**
	 * 创建滚动条
	 */
	ScrollBar createScrollBar();
	
	/**
	 * 创建窗口
	 */
	Window createWindow();

}
