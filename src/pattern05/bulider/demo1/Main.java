package pattern05.bulider.demo1;

public class Main {
	public static void main(String[] args) {
		Director d1 = new Director();
		MyBulider mb1 = new SportCupBulider();
		d1.create(mb1);

		Director d2 = new Director();
		MyBulider mb2 = new GlassCupBulider();
		d2.create(mb2);
	}
}