package pattrtn04.abstractFactory.demo2;

public class SVDFactory implements IAbstractFactory {
	@Override
	public IICON createICON() {
		return new SmarICON();
	}

	@Override
	public IProtocol createIProtocol() {
		return new SmarRules();
	}
}