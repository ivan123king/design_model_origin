package com.dm.prototype.demo01;

import com.dm.prototype.demo01.pojo.Position;

public class Client {

	public static void main(String[] args) {
		Graphic wholeNote = new WholeNote();
		Graphic halfNote = new HalfNote();
		
		GraphicTool graphicTool = new GraphicTool();
		
		graphicTool.manipulate(wholeNote,new Position(21, 32, 21));
		graphicTool.manipulate(halfNote, new Position(87, 78, 56));
		
	}
}
