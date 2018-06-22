package pattern12.flyweight.demo2;

import java.util.Hashtable;

public class FlyWeightFactory {
	static Hashtable<String, Enemy> pool = new Hashtable<String, Enemy>();

	static {
		pool.put("solider", new Solider());
		pool.put("ninja", new Ninja());
	}

	public FlyWeightFactory() {
		poolAdd("solider", new Solider());
		poolAdd("ninja", new Ninja());
	}

	void poolAdd(String key, Enemy e) {
		pool.put(key, e);
	}

	Enemy getFlyWeight(String key) {
		if (!pool.contains(key)) {
			System.out.println("没有这个对象，请先添加！");
			return null;
		}
		return (Enemy) pool.get(key);
	}
}
