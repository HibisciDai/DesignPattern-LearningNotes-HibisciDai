package pattern23.iterator.demo1;

public class Main {
	public static void main(String[] args) {
		NameRepository nr = new NameRepository();
		for (Iterator it = nr.getIterator(); it.hasNext();) {
			String name = (String) it.next();
			System.out.println("name : " + name);
		}
	}
}