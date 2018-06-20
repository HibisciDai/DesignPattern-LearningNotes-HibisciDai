package pattern10.decorator.demo1;

public class WithFlat extends Decorater {

	public WithFlat(Cake c) {
		super(c);
	}

	@Override
	void funExtend() {
		System.out.println("WithFlat");
	}
}