package com.dm.builder.demo01;

import com.dm.builder.demo01.product.ASCIIText;
import com.dm.builder.demo01.product.RTFText;
import com.dm.builder.demo01.product.TexText;

public class Client {

	public static void main(String[] args) {
		tex();
	}
	
	private static void tex(){
		TexTextConverter converter = new TexTextConverter();
		RTFReader rtfReader = new RTFReader(converter);
		
		RTFText rtfText = initRTFText();
		rtfReader.parseRTF(rtfText);

		TexText text = converter.getTexText();
		System.out.println(text.content);
	}
	
	private static void ascii(){
		ASCIIConverter converter = new ASCIIConverter();
		RTFReader rtfReader = new RTFReader(converter);
		
		RTFText rtfText = initRTFText();
		rtfReader.parseRTF(rtfText);

		ASCIIText text = converter.getASCIIText();
		System.out.println(text.content);
	}
	
	private static RTFText initRTFText(){
		RTFText rtfText = new RTFText();
		String content = "hello world";
		char[] cs = content.toCharArray();
		
		rtfText.chars = new char[cs.length];
		rtfText.types = new int[cs.length];
		rtfText.fonts = new int[cs.length];
		
		for (int i = 0; i < cs.length; i++) {
			rtfText.chars[i] = cs[i];
			rtfText.types[i] = 1;
			rtfText.fonts[i] = 11;
		}
		return rtfText;
	}
}
