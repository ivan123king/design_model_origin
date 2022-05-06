package com.dm.builder.demo01;


/**
 * 文本转换
 * 抽象建造者
 * @author Administrator
 *
 */
public abstract class TextConverter {
	/**
	 * 修改编码
	 * @param c
	 */
	public void convertCharacter(char c){
		
	}
	
	/**
	 * 修改字体
	 * @param font
	 */
	public void convertFontChange(int font){
		
	}
	
	/**
	 * 转换成文章
	 */
	public void convertParagraph(){
		
	}
	
	/**
	 * 其实这里可以定义一个getText，用于返回对应的AsciiText,TexText,TextWidget
	 */
	
}
