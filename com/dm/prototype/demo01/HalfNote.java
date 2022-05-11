package com.dm.prototype.demo01;

import com.dm.prototype.demo01.pojo.Position;
import com.dm.prototype.demo01.pojo.Shape;

/**
 * 半分音符
 * @author Administrator
 *
 */
public class HalfNote implements MusicalNote{
	/*
	 * 半分音符的形状
	 */
	private Shape shape = new Shape("HalfNote");

	@Override
	public Graphic clone() {
		HalfNote note = new HalfNote();
		return note;
	}

	@Override
	public void draw(Position position) {
		System.out.println("HalfNote");
	}

	
}
