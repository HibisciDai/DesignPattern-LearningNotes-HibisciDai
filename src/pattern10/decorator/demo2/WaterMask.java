package pattern10.decorator.demo2;

public class WaterMask extends Decorater {

	public WaterMask(Painting p) {
		super(p);
	}

	@Override
	void funExtend() {
		System.out.println("With WaterMask");
	}
}