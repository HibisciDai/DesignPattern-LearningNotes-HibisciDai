package pattern10.decorator.demo2;

public class Main {
	public static void main(String[] args) {
		Painting p = new VanGogh();
		Decorater d = new Border(p);
		d.show();
	}
}