package com.dm.bridge.demo02;

public class Client {
	public static void main(String[] args) {
		/**
		 * WindowImp抽象接口继承了Window抽象接口
		 * IconWindow和TransientWindow实现了Window抽象接口
		 * Window这个抽象接口就是维系窗口类型和具体平台实现的关键点
		 * Window和WindowImp这种继承关系就是桥
		 */
		WindowImp windowImp = new PMWindowImp();
		Window window = new IconWindow(windowImp);
		window.drawWindow();
	}

}
