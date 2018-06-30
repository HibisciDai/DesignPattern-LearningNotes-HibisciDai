package pattern17.mediator.demo1;

public class Concreate extends Mediator {
	@Override
	void excute(String type) {
		Sky sky = new Sky();
		Sea sea = new Sea();
		LifeForm lf = new LifeForm();
		switch (type) {
		case "f": // 接收到 Sea:flood()
			sky.fullMood();
			lf.transForm();
			break;
		case "s": // 接收到Sky:sunny()
			sea.eraporate();
			lf.grow();
			break;
		case "d": // 接收到LifeForm:dieOut()
			sky.gray();
			sea.diredup();
			break;
		}
	}
}