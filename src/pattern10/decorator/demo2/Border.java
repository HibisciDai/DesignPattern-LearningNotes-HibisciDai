package pattern10.decorator.demo2;

public class Border extends Decorater {

	public Border(Painting p) {
		super(p);
	}

	@Override
	void funExtend() {
		System.out.println("With Border");
	}
}