package pattern10.decorator.demo1;

public class WithFlower extends Decorater {

	public WithFlower(Cake c) {
		super(c);
	}

	@Override
	void funExtend() {
		System.out.println("WithFlower");
	}
}