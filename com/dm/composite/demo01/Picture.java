package com.dm.composite.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 图片
 * 
 * @author Administrator
 *
 */
public class Picture extends Graphic{

	/**
	 * 子节点
	 */
	List<Graphic> graphics = new ArrayList<>();

	/**
	 * 绘制图形
	 */
	public void draw(){
		for (Graphic g : graphics) {
			g.draw();
		}
	}

	/**
	 * 添加子节点
	 * 
	 * @param graphic
	 */
	public void add(Graphic graphic) {
		this.graphics.add(graphic);
	}

	/**
	 * 添加子节点
	 * 
	 * @param graphic
	 */
	public void remove(Graphic graphic) {
		Iterator<Graphic> iter = this.graphics.iterator();
		while (iter.hasNext()) {
			Graphic g = iter.next();
			if (g.id.equals(graphic.id)) {
				iter.remove();
				break;
			}
		}
	}
	
	/**
	 * 获取子节点
	 * @param index
	 * @return
	 */
	public Graphic getChild(int index){
		if(index<this.graphics.size()){
			return this.graphics.get(index);
		}
		return null;
	}

}
