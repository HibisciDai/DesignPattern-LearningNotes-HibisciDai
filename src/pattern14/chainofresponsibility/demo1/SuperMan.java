package pattern14.chainofresponsibility.demo1;

public class SuperMan extends AbstractRepairMan {
	@Override
	void handle(int i) {
		if (i == 3) {
			System.out.println("i can handle it - SuperMan");
		}
	}
}