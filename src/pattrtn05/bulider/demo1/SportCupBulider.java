package pattrtn05.bulider.demo1;

public class SportCupBulider extends MyBulider {

	@Override
	void BuliderString() {
		this.myString = "SportCup-String";
	}

	@Override
	void BuliderCup() {
		this.myCup = "SportCup-Cup";
	}

	@Override
	void BuliderBody() {
		this.myBody = "SportCup-Body";
	}
}