package com.dm.composite.demo01;


/**
 * 多边形
 * @author Administrator
 *
 */
public class Rectangle extends Graphic{

	@Override
	public void draw() {
	}

	//---------------叶子节点，这些都是空实现---------------
	@Override
	public void add(Graphic graphic) {
	}

	@Override
	public void remove(Graphic graphic) {
	}

	@Override
	public Graphic getChild(int index) {
		return null;
	}
}
