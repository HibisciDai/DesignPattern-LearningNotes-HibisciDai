package pattern10.decorator.demo2;

public abstract class Decorater extends Painting {

	Painting p;

	public Decorater(Painting p) {
		super();
		this.p = p;
	}

	@Override
	void show() {
		p.show();
		funExtend();
	}

	abstract void funExtend();
}