package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter extends DrawerFeature implements Job2dDriver {
	private int startX = 0, startY = 0;
	private ILine line;
	
	public LineDrawerAdapter(ILine _line) {
		super();
		this.line = _line;
	}
	
	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}
	
	public String getPosition() {
		return "x:" + this.startX + ", y:" + this.startY;
	}

	@Override
	public void operateTo(int x, int y) {
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		this.setPosition(x, y);

		getDrawerController().drawLine(line);
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
