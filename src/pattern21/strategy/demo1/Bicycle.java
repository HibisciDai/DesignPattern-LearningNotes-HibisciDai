package pattern21.strategy.demo1;

public class Bicycle implements ITravelStrategy {
	@Override
	public void buyTicket() {
		System.out.println("一辆单车");
	}

	@Override
	public void otherOper() {
		System.out.println("自备食餐");
	}
}