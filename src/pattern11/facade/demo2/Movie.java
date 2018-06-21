package pattern11.facade.demo2;

public class Movie {
	private Projector p;
	private CD c;
	private DVD d;
	private Light l;

	public Movie() {
		p = new Projector();
		c = new CD();
		d = new DVD();
		l = new Light();
	}

	public void watch() {
		p.up();
		l.off();
		d.on();
		c.on();
		c.play();
		d.play();
		d.off();
		c.off();
		l.on();
		p.down();
	}
}