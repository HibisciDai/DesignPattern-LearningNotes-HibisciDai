package pattern14.chainofresponsibility.demo1;

public class Main {
	public static void main(String[] args) {
		Boy b = new Boy();
		b.handle(2);
	}
}