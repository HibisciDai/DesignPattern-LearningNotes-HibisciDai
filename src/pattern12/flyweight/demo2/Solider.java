package pattern12.flyweight.demo2;

public class Solider extends Enemy {
	@Override
	void show() {
		System.out.println("士兵，高：" + height + ",肤色" + skinColor.toString());
	}
}