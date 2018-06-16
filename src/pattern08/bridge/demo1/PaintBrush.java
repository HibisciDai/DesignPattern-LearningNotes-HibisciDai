package pattern08.bridge.demo1;

public abstract class PaintBrush {
	Color c;

	public PaintBrush(Color c) {
		super();
		this.c = c;
	}

	abstract void draw();
}