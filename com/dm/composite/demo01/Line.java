package com.dm.composite.demo01;

import java.rmi.AccessException;


/**
 * 线条
 * @author Administrator
 *
 */
public class Line extends Graphic{

	@Override
	public void draw() {
	}

	@Override
	public Graphic getChild(int index) throws AccessException {
		throw new AccessException("无此操作");
	}
}
