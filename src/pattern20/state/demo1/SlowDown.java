package pattern20.state.demo1;

public class SlowDown extends RunState {
	@Override
	void handle() {
		System.out.println("减速");
	}
}