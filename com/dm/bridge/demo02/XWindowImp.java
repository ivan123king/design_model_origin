package com.dm.bridge.demo02;

/**
 * X系统平台窗口
 * @author Administrator
 *
 */
public class XWindowImp implements WindowImp{

	@Override
	public void drawText() {
		this.pmDrawString();
	}

	@Override
	public void drawRect() {
		this.pmDrawLine();
	}
	
	private void pmDrawLine(){
		System.out.println("pmDrawLine");
	}
	
	private void pmDrawString(){
		System.out.println("pmDrawString");
	}

	@Override
	public void drawWindow() {
		
	}

}
