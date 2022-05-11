package com.dm.prototype.demo01;

import com.dm.prototype.demo01.pojo.Position;

/**
 * 抽象图形接口
 * 
 * @author Administrator
 *
 */
public interface Graphic {

	/**
	 * 绘制图形
	 * 
	 * @param position
	 */
	void draw(Position position);

	/**
	 * 克隆自己 在java中可以使用cloneable,来重写Object的clone方法，此处假设自己实现
	 * 
	 * @return
	 */
	Graphic clone();
}
