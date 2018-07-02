package pattern20.state.demo1;

public class AutoMaticDrive {
	SlowDown sd = new SlowDown();
	EvenSpeed es = new EvenSpeed();
	SpeedUp su = new SpeedUp();

	public void roodBlackTrue(RunState rs) {
		if (rs.getClass() == SlowDown.class) {
			sd.handle();
		} else if (rs.getClass() == EvenSpeed.class) {
			es.handle();
		} else if (rs.getClass() == SpeedUp.class) {
			su.handle();
		}
	}

	public void roodBlackFalse(RunState rs) {
		if (rs.getClass() == SlowDown.class) {
			sd.handle();
		} else if (rs.getClass() == EvenSpeed.class) {
			es.handle();
		} else if (rs.getClass() == SpeedUp.class) {
			su.handle();
		}
	}
}