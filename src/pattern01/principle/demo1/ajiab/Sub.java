package pattern01.principle.demo1.ajiab;

public class Sub extends Operater {
	public int getResult(int a, int b) {
		if (a >= b) {
			return a - b;
		} else {
			return b - a;
		}
	}
}