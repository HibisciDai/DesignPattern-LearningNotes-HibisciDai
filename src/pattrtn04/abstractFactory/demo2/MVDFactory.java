package pattrtn04.abstractFactory.demo2;

public class MVDFactory implements IAbstractFactory {
	@Override
	public IICON createICON() {
		return new MiICON();
	}

	@Override
	public IProtocol createIProtocol() {
		return new MiRules();
	}
}