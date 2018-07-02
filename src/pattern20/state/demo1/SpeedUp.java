package pattern20.state.demo1;

public class SpeedUp extends RunState {
	@Override
	void handle() {
		System.out.println("加速");
	}
}