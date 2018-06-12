package pattrtn04.abstractFactory.demo2;

public class IOSRules implements IProtocol {
	@Override
	public void communication() {
		System.out.println("IOS通信规则");
	}
}