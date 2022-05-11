package com.dm.prototype.demo01;

import com.dm.prototype.demo01.pojo.Position;
import com.dm.prototype.demo01.pojo.Shape;

/**
 * 全音符
 * @author Administrator
 *
 */
public class WholeNote implements MusicalNote{
	/*
	 * 全音符的形状
	 */
	private Shape shape = new Shape("WholeNote");
	
	@Override
	public Graphic clone() {
		WholeNote note = new WholeNote();
		return note;
	}

	@Override
	public void draw(Position position) {
		System.out.println("WholeNote");
	}

	
}
