package pattern14.chainofresponsibility.demo2;

public class Main {
	public static void main(String[] args) {
		RepairOrder ro = new RepairOrder();
		ro.getFirst().handle(2);
	}
}