package pattern08.bridge.demo1;

public class Main {
	public static void main(String[] args) {
		PaintBrush pb = new ThickBrush(new Blue());
		pb.draw();
	}
}