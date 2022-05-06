package com.dm.builder.demo01;

import com.dm.builder.demo01.product.TextWidget;

/**
 * 具体建造者  
 * @author Administrator
 *
 */
public class TextWidgetConverter extends TextConverter{
	TextWidget textWidget = new TextWidget();

	@Override
	public void convertCharacter(char c) {
		this.textWidget.content += String.valueOf(c);
	}

	@Override
	public void convertFontChange(int font) {
		this.textWidget.font = font;
	}

	@Override
	public void convertParagraph() {
		super.convertParagraph();
	}
	
	public TextWidget getTextWidget(){
		return this.textWidget;
	}
}
