package com.dm.builder.demo01;

import com.dm.builder.demo01.product.RTFText;

/**
 * 指挥者
 * 指挥者不返回产品，只负责督促建造过程
 * @author Administrator
 *
 */
public class RTFReader {
	
	final int CHAR = 1;
	final int FONT = 2;
	final int PARA = 3;
	
	
	TextConverter textConverter;
	
	public RTFReader(TextConverter textConverter){
		this.textConverter = textConverter;
	}
	
	public void setTextConverter(TextConverter textConverter) {
		this.textConverter = textConverter;
	}


	/**
	 * 假设此处传递进来的是RTF对象，解析RTF对象，转换成对应的内容
	 * @param content
	 */
	public void parseRTF(RTFText rtfText){
		for (int i = 0; i < rtfText.chars.length; i++) {
			switch(rtfText.types[i]){
			case CHAR:
				this.textConverter.convertCharacter(rtfText.chars[i]);
				break;
			case FONT:
				this.textConverter.convertFontChange(rtfText.fonts[i]);
				break;
			case PARA:
				this.textConverter.convertParagraph();
				break;
			}
			
		}
	}
	
}
