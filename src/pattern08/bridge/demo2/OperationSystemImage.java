package pattern08.bridge.demo2;

public abstract class OperationSystemImage {
	Image i;

	public OperationSystemImage(Image i) {
		super();
		this.i = i;
	}

	abstract void show();
}