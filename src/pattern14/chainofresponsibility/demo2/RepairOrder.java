package pattern14.chainofresponsibility.demo2;

public class RepairOrder {
	Boy b = new Boy();

	RepairOrder() {
		Adult a = new Adult();
		b.setSuper(a);
		a.setSuper(new SuperMan());
	}

	public AbstractRepairMan getFirst() {
		return b;
	}
}