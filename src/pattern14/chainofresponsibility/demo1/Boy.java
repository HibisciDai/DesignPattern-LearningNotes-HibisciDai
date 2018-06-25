package pattern14.chainofresponsibility.demo1;

public class Boy extends AbstractRepairMan {
	@Override
	void handle(int i) {
		if (i == 1) {
			System.out.println("i can handle it - Boy");
		} else {
			Adult a = new Adult();
			a.handle(i);
		}
	}
}