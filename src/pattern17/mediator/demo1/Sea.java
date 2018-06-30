package pattern17.mediator.demo1;

public class Sea extends Nature {
	void flood() {
		System.out.println("涨潮");
		m.excute("f");
	}

	void diredup() {
		System.out.println("干枯");
	}

	void eraporate() {
		System.out.println("蒸发");
	}
}