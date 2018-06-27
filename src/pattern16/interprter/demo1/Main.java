package pattern16.interprter.demo1;

public class Main {
	public static void main(String[] args) {
		Context c = new Context();
		c.myNumNotation = "312312353";
		c.myScale = "01";

		Scale s = new Scale();
		s.Interpreter(c);

		NumberNotation nn = new NumberNotation();
		nn.Interpreter(c);
	}
}