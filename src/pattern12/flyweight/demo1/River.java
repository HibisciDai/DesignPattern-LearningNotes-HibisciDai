package pattern12.flyweight.demo1;

public class River extends Forest {
	@Override
	void show() {
		System.out.println("一条" + size + "米长的河");
	}
}