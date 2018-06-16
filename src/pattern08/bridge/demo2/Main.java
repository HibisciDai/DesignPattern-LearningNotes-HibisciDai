package pattern08.bridge.demo2;

public class Main {
	public static void main(String[] args) {
		OperationSystemImage i1 = new LinuxOSImage(new GIFImage());
		i1.show();
		OperationSystemImage i2 = new WinOSImage(new PNGImage());
		i2.show();
	}
}