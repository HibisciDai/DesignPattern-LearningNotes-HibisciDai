package pattern06.prototype.demo2;

public class Main {
	public static void main(String[] args) {
		Report e = new Report("hibiscidai", "306");
		e.show();

		Report e1 = e.myClone();
		e1.name = "小白";
		e1.number = "666";
		e1.show();
	}
}