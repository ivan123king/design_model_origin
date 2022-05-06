package com.dm.builder.demo01;

import com.dm.builder.demo01.product.TexText;

/**
 * 具体的建造者
 * @author Administrator
 *
 */
public class TexTextConverter extends TextConverter{
	
	TexText texText = new TexText();

	@Override
	public void convertCharacter(char c) {
		this.texText.content += String.valueOf(c);
	}

	@Override
	public void convertFontChange(int font) {
		this.texText.font = font;
	}

	@Override
	public void convertParagraph() {
		super.convertParagraph();
	}
	
	public TexText getTexText(){
		return this.texText;
	}

}
