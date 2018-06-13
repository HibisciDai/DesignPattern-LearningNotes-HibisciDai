package pattrtn05.bulider.demo1;

public class GlassCupBulider extends MyBulider {

	@Override
	void BuliderString() {
		this.myString = "GlassCup-String";
	}

	@Override
	void BuliderCup() {
		this.myCup = "GlassCup-Cup";
	}

	@Override
	void BuliderBody() {
		this.myBody = "GlassCup-Body";
	}
}