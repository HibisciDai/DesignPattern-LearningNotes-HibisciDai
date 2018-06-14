package pattern03.factory.demo2;

public class Main {
	public static void main(String[] args) {
		Factory myFactory = new MyFactory();
		Helper helper1 = myFactory.create("SQLHelper");
		helper1.open();
		helper1.operation();
		helper1.close();
		Helper helper2 = myFactory.create("OracleHelper");
		helper2.open();
		helper2.operation();
		helper2.close();
	}
}