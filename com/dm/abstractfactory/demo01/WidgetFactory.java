package com.dm.abstractfactory.demo01;

/**
 * ���󹤳�
 * @author Administrator
 *
 */
public interface WidgetFactory {
	
	/**
	 * ����������
	 */
	ScrollBar createScrollBar();
	
	/**
	 * ��������
	 */
	Window createWindow();

}
