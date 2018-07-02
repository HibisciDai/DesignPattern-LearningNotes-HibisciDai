package pattern21.strategy.demo1;

public class AirPlan implements ITravelStrategy {
	@Override
	public void buyTicket() {
		System.out.println("一张飞机票");
	}

	@Override
	public void otherOper() {
		System.out.println("吃的飞机餐");
	}
}