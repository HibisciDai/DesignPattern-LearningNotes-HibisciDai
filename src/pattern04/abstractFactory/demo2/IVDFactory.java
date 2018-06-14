package pattern04.abstractFactory.demo2;

public class IVDFactory implements IAbstractFactory {
	@Override
	public IICON createICON() {
		return new FlatICON();
	}

	@Override
	public IProtocol createIProtocol() {
		return new IOSRules();
	}
}