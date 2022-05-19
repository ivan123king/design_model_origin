package com.dm.composite.demo01;

import java.rmi.AccessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 图形类
 * 
 * @author Administrator
 *
 */
public abstract class Graphic {

	/**
	 * 独一无二的标志位
	 */
	public String id = "";

	/**
	 * 绘制图形
	 */
	public abstract void draw();

	/**
	 * 添加子节点
	 * 
	 * @param graphic
	 */
	public void add(Graphic graphic) {
	}

	/**
	 * 添加子节点
	 * 
	 * @param graphic
	 */
	public void remove(Graphic graphic) {
	}
	
	/**
	 * 获取子节点
	 * @param index
	 * @return
	 */
	public Graphic getChild(int index) throws AccessException{
		return null;
	}

}
