package pattrtn03.factory.demo1;

public class ULtramanFactory implements IFactory {
	@Override
	public IMonster create() {
		return new ULtraman();
	}
}