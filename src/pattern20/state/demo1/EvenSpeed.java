package pattern20.state.demo1;

public class EvenSpeed extends RunState {
	@Override
	void handle() {
		System.out.println("匀速");
	}
}