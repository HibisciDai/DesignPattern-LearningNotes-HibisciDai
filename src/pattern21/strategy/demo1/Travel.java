package pattern21.strategy.demo1;

public class Travel {
	private ITravelStrategy st;

	public void setSt(ITravelStrategy st) {
		this.st = st;
	}

	public void go() {
		st.buyTicket();
		st.otherOper();
	}
}