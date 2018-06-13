package pattrtn05.bulider.demo2;

public abstract class MyBulider {
	String title;
	String icon;
	String message;

	abstract void BuliderTitle();

	abstract void BuliderIcon();

	abstract void BuliderMessage();

	void getResult() {
		System.out.println(title);
		System.out.println(icon);
		System.out.println(message);
	}
}