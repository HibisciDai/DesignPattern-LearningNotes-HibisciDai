package pattern06.prototype.demo2;

public class Report implements Cloneable {
	String name;
	String number;

	public Report() {
		super();
	}

	public Report(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public void show() {
		System.out.println("Report-" + name);
		System.out.println("Report-" + number);
	}

	public Report myClone() {
		Report r = null;
		try {
			r = (Report) this.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
}