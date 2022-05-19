package com.dm.composite.demo01;

import java.rmi.AccessException;


/**
 * 文字
 * @author Administrator
 *
 */
public class Text extends Graphic{

	@Override
	public void draw() {
	}

	@Override
	public Graphic getChild(int index) throws AccessException {
		throw new AccessException("无此操作");
	}
}
