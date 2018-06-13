package pattrtn05.bulider.demo1;

public class Director {
	void create(MyBulider b) {
		b.BuliderString();
		b.BuliderCup();
		b.BuliderBody();
		b.getResult();
	}
}