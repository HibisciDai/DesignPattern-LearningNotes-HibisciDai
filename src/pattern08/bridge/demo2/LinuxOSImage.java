package pattern08.bridge.demo2;

public class LinuxOSImage extends OperationSystemImage {

	public LinuxOSImage(Image i) {
		super(i);
	}

	@Override
	void show() {
		System.out.println("LinuxOSImage");
		i.getImage();
	}
}