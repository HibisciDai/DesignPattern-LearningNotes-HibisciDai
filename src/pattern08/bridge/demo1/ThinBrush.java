package pattern08.bridge.demo1;

public class ThinBrush extends PaintBrush {
	public ThinBrush(Color c) {
		super(c);
	}

	@Override
	void draw() {
		c.getColor();
		System.out.println("细刷");
	}
}