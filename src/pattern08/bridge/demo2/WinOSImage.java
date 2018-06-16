package pattern08.bridge.demo2;

public class WinOSImage extends OperationSystemImage {

	public WinOSImage(Image i) {
		super(i);
	}

	@Override
	void show() {
		System.out.println("WinOSImage");
		i.getImage();
	}
}