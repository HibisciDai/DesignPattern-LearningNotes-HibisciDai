package pattrtn05.bulider.demo2;

public class Main {
	public static void main(String[] args) {
		MyBulider mb1 = new Conform();
		Director d1 = new Director(mb1);
		d1.create();

		MyBulider mb2 = new Information();
		Director d2 = new Director(mb2);
		d2.create();
	}
}