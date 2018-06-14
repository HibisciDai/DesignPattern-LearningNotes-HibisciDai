package pattern05.bulider.demo1;

public abstract class MyBulider {
	String myString;
	String myCup;
	String myBody;

	abstract void BuliderString();

	abstract void BuliderCup();

	abstract void BuliderBody();

	void getResult() {
		System.out.println(myString);
		System.out.println(myCup);
		System.out.println(myBody);
	}
}