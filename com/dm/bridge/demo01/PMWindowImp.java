package com.dm.bridge.demo01;
/**
 * PM系统的窗口实现
 * @author Administrator
 *
 */
public class PMWindowImp implements WindowImp{

	@Override
	public void devDrawText() {
		this.pmDrawString();
	}

	@Override
	public void devDrawLine() {
		this.pmDrawLine();
	}
	
	private void pmDrawLine(){}
	
	private void pmDrawString(){}

}
