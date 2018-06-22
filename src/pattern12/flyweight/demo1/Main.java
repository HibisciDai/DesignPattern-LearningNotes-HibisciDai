package pattern12.flyweight.demo1;

public class Main {
	public static void main(String[] args) {
		FlyWeightFactory fwf = new FlyWeightFactory();

		for (int i = 100; i <= 105; i++) {
			Forest f = fwf.getFlyWeight("river");
			f.size = i;
			f.show();
		}

		for (int i = 3; i <= 8; i++) {
			Forest f = fwf.getFlyWeight("tree");
			f.size = i;
			f.show();
		}

		for (int i = 20; i <= 25; i++) {
			Forest f = fwf.getFlyWeight("gress");
			f.size = i;
			f.show();
		}
	}
}