package pattern21.strategy.demo1;

public class Main {
	public static void main(String[] args) {
		Travel t = new Travel();
		t.setSt(new AirPlan());
		t.go();
		t.setSt(new Train());
		t.go();
		t.setSt(new Bicycle());
		t.go();
	}
}