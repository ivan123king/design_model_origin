package com.dm.adapter.demo01;

public class TextShape extends TextView implements Shape{

	private TextView text;
	
	public TextShape(TextView text) {
		this.text = text;
	}

	@Override
	public String boundingBox() {
		return this.text.getExtent();
	}

	@Override
	public Manipulator createManipulator() {
		return new TextManipulator();
	}

}
