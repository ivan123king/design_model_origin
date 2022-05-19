package com.dm.bridge.demo01;

public class Client {
	public static void main(String[] args) {
		/**
		 * 如果没有drawWindow这个方法的话，那么客户端调用应该是如下代码所示
		 * 这种直接使用IconWindow，那么Window这个抽象的作用就小了
		 * 客户端面向抽象比面对具体类更能解耦
		 */
//		WindowImp windowImp = new XWindowImp();
//		IconWindow window = new IconWindow(windowImp);
//		window.drawBorder();
		
		/**
		 * 如下是增加了drawWindow方法的调用，在实际使用时初始化IconWindow类
		 * 统一调用drawWindow用来绘制窗口
		 */
		WindowImp windowImp = new XWindowImp();
		Window window = new IconWindow(windowImp);
		window.drawWindow();
	}

}
