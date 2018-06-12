package pattrtn03.factory.demo2;

public class SQLHelper implements Helper {

	@Override
	public void open() {
		System.out.println("SQLHelper-open");
	}

	@Override
	public void operation() {
		System.out.println("SQLHelper-operation");
	}

	@Override
	public void close() {
		System.out.println("SQLHelper-close");
	}
}