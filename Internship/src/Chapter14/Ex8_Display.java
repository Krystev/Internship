package Chapter14;
import java.awt.Rectangle;

public class Ex8_Display {
	private long numColor;
	private Rectangle displaySize;
	
	
	
	public Ex8_Display (int x, int y, long numColors) {
		this.setDisplaySize(new Rectangle(x, y));
		this.setNumColor(numColor);
	}
	
	public long getNumColor() {
		return numColor;
	}
	public void setNumColor(long numColor2) {
		this.numColor = numColor2;
	}

	public Rectangle getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Rectangle displaySize) {
		this.displaySize = displaySize;
	}
}
