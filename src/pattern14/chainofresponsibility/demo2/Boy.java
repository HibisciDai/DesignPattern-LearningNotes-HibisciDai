package pattern14.chainofresponsibility.demo2;

public class Boy extends AbstractRepairMan {
	@Override
	public void handle(int i) {
		if (i == 1) {
			System.out.println("i can handle it - Boy");
		} else {
			Adult a = new Adult();
			a.handle(i);
		}
	}
}