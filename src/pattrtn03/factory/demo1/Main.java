package pattrtn03.factory.demo1;

public class Main {
	public static void main(String[] args) {
		IFactory a = new ULtramanFactory();
		a.create().show();
	}
}