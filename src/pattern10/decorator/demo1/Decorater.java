package pattern10.decorator.demo1;

public abstract class Decorater extends Cake {
	Cake c;

	public Decorater(Cake c) {
		super();
		this.c = c;
	}

	@Override
	void show() {
		c.show();
		funExtend();
	}

	abstract void funExtend();
}