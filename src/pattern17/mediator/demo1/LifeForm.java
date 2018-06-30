package pattern17.mediator.demo1;

public class LifeForm extends Nature {
	void transForm() {
		System.out.println("生物变形");
	}

	void grow() {
		System.out.println("生物生长");
	}

	void dieOut() {
		System.out.println("生物灭绝");
		m.excute("d");
	}
}