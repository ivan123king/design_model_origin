package com.dm.prototype.demo01;

import java.util.ArrayList;
import java.util.List;

import com.dm.prototype.demo01.pojo.Position;

/**
 * 音符绘制工具
 * @author Administrator
 *
 */
public class GraphicTool implements Tool {

	List<Graphic> graphics = new ArrayList<>();
	
	@Override
	public void manipulate(Graphic graphic,Position position) {
		Graphic clone = graphic.clone();
		this.graphics.add(clone);
		clone.draw(position);
	}
}

