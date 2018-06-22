package pattern12.flyweight.demo1;

public class Tree extends Forest {
	@Override
	void show() {
		System.out.println("一课" + size + "米高的树");
	}
}