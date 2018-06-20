package pattern10.decorator.demo1;

public class Main {
	public static void main(String[] args) {
		Cake c = new CheeseCake();
		Decorater d = new WithFlat(c);
		d.show();
	}
}