package pattern14.chainofresponsibility.demo2;

public abstract class AbstractRepairMan {
	protected AbstractRepairMan ar;

	public abstract void handle(int i);

	public void setSuper(AbstractRepairMan ar) {
		this.ar = ar;
	}
}