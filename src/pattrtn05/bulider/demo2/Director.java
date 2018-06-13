package pattrtn05.bulider.demo2;

public class Director {
	MyBulider mb;

	Director(MyBulider mb) {
		this.mb = mb;
	}

	void create() {
		mb.BuliderIcon();
		mb.BuliderMessage();
		mb.BuliderTitle();
		mb.getResult();
	}
}