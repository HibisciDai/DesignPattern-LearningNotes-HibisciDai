package pattern19.observer.demo2;

public class Main {
	public static void main(String[] args) {
		BroodCast b = new BroodCast();
		b.setListenState("the teacher is coming");
		b.notifyed();
	}
}