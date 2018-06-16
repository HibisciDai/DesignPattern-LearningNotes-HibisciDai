package pattern08.bridge.demo2;

public class UniOSImgae extends OperationSystemImage {

	public UniOSImgae(Image i) {
		super(i);
	}

	@Override
	void show() {
		System.out.println("UniOSImgae");
		i.getImage();
	}
}