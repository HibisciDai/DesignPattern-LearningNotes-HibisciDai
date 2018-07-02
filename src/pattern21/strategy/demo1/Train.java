package pattern21.strategy.demo1;

public class Train implements ITravelStrategy {
	@Override
	public void buyTicket() {
		System.out.println("一张火车票");
	}

	@Override
	public void otherOper() {
		System.out.println("吃的火车餐");
	}
}