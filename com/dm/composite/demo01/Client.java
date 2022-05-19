package com.dm.composite.demo01;

public class Client {
	
	public static void main(String[] args) {
		Graphic picture = new Picture();
		
		Graphic line = new Line();
		Graphic rect = new Rectangle();
		Graphic text = new Text();
		
		picture.add(line);
		picture.add(rect);
		picture.add(text);
		
		Graphic picture2 = new Picture();
		picture2.add(picture);
		
		picture2.draw();
	}

}
