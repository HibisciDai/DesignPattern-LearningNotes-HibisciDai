package pattern10.decorator.demo2;

public class Masking extends Decorater {

	public Masking(Painting p) {
		super(p);
	}

	@Override
	void funExtend() {
		System.out.println("With Masking");
	}
}