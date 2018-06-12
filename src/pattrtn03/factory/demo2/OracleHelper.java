package pattrtn03.factory.demo2;

public class OracleHelper implements Helper {

	@Override
	public void open() {
		System.out.println("OracleHelper-open");
	}

	@Override
	public void operation() {
		System.out.println("OracleHelper-operation");
	}

	@Override
	public void close() {
		System.out.println("OracleHelper-close");
	}
}