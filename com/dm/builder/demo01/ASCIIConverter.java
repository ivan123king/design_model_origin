package com.dm.builder.demo01;

import com.dm.builder.demo01.product.ASCIIText;

/**
 * 具体的建造者
 * @author Administrator
 *
 */
public class ASCIIConverter extends TextConverter{

	ASCIIText asciiText = new ASCIIText();
	
	/**
	 * 将文本内容转换成Ascii
	 */
	@Override
	public void convertCharacter(char c) {
		this.asciiText.content += (int)c;
	}
	
	public ASCIIText getASCIIText(){
		return this.asciiText;
	}

}
