package pattern02.singleton;

//登记式/静态内部类
public class Singleton6 {
	private static class SingletonHolder {
		private static final Singleton6 INSTANCE = new Singleton6();
	}

	public Singleton6() {
	}

	private static final Singleton6 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}