package pattern12.flyweight.demo1;

import java.util.Hashtable;

public class FlyWeightFactory {
	Hashtable<String, Forest> pool = new Hashtable<String, Forest>();

	public FlyWeightFactory() {
		poolAdd("river", new River());
		poolAdd("tree", new Tree());
		poolAdd("gress", new Gress());
	}

	void poolAdd(String key, Forest forest) {
		pool.put(key, forest);
	}

	Forest getFlyWeight(String key) {
		if (!pool.contains(key)) {
			System.out.println("没有这个对象，请先添加！");
			return null;
		}
		return (Forest) pool.get(key);
	}
}