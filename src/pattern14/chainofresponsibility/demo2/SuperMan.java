package pattern14.chainofresponsibility.demo2;

public class SuperMan extends AbstractRepairMan {
	@Override
	public void handle(int i) {
		if (i == 3) {
			System.out.println("i can handle it - SuperMan");
		}
	}
}