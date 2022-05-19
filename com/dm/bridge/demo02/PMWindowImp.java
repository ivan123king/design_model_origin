package com.dm.bridge.demo02;
/**
 * PM系统的窗口实现
 * @author Administrator
 *
 */
public class PMWindowImp implements WindowImp{

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
