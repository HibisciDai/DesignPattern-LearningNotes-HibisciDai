package pattern16.interprter.demo1;

public class Scale extends NotationInterpreter {
	@Override
	void Interpreter(Context context) {
		String scale = context.myScale;
		switch (scale) {
		case "01":
			System.out.println("L0");
			break;
		case "02":
			System.out.println("MID");
			break;
		case "03":
			System.out.println("HI");
			break;
		}
	}
}