package com.dm.abstractfactory.demo01;

/**
 * 客户端
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//初始化界面时，创建窗口和滚动条
		{
			WidgetFactory factory = new MotifWidgetFactory();
			
			Window window = factory.createWindow();
			ScrollBar scrollBar = factory.createScrollBar();
		}
		{
			WidgetFactory factory = new PMWidgetFactory();
			
			Window window = factory.createWindow();
			ScrollBar scrollBar = factory.createScrollBar();
		}
		
	}
}
