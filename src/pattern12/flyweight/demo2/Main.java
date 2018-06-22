package pattern12.flyweight.demo2;

public class Main {
	public static void main(String[] args) {
		FlyWeightFactory fwf = new FlyWeightFactory();

		Enemy f = fwf.getFlyWeight("solider");
		f.height = 1.8;
		f.skinColor = new Color("绿色");
		f.show();

		Enemy f1 = fwf.getFlyWeight("ninja");
		f1.height = 1.65;
		f1.skinColor = new Color("蓝色");
		f1.show();

	}
}