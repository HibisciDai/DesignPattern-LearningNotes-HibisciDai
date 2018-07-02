package pattern20.state.demo1;

public class Main {
	public static void main(String[] args) {
		AutoMaticDrive ad = new AutoMaticDrive();
		ad.roodBlackTrue(new SpeedUp());
	}
}