package pattern08.bridge.demo1;

public class ThickBrush extends PaintBrush {
	public ThickBrush(Color c) {
		super(c);
	}

	@Override
	void draw() {
		c.getColor();
		System.out.println("浓刷");
	}
}