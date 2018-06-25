package pattern14.chainofresponsibility.demo1;

public class Adult extends AbstractRepairMan {
	@Override
	void handle(int i) {
		if (i == 2) {
			System.out.println("i can handle it - Adult");
		} else {
			SuperMan s = new SuperMan();
			s.handle(i);
		}
	}
}