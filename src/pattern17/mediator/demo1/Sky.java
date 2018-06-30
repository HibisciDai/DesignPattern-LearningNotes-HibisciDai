package pattern17.mediator.demo1;

public class Sky extends Nature {
	void sunny() {
		System.out.println("晴朗");
		m.excute("s");
	}

	void fullMood() {
		System.out.println("满月");
	}

	void gray() {
		System.out.println("灰暗");
	}
}