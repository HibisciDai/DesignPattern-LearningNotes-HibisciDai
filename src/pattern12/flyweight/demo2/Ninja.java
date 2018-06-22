package pattern12.flyweight.demo2;

public class Ninja extends Enemy {
	@Override
	void show() {
		System.out.println("忍者，高：" + height + ",肤色" + skinColor.toString());
	}
}