package com.dm.abstractfactory.demo01;

/**
 * �ͻ���
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		//��ʼ������ʱ���������ں͹�����
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
