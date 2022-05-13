package com.dm.adapter.demo01;

/**
 * 客户端
 * @author Administrator
 *
 */
public class DrawingEditor {
	
	public static void draw(){
		TextView text = new TextView();
		Shape shape = new TextShape(text);
		
		String box = shape.boundingBox();
		Manipulator manipulator = shape.createManipulator();
		
	}
}
