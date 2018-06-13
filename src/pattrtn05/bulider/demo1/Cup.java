package pattrtn05.bulider.demo1;

public class Cup {
	String CupString;
	String Cup;
	String CupBody;

	public String getCupString() {
		return CupString;
	}

	public void setCupString(String cupString) {
		CupString = cupString;
	}

	public String getCup() {
		return Cup;
	}

	public void setCup(String cup) {
		Cup = cup;
	}

	public String getCupBody() {
		return CupBody;
	}

	public void setCupBody(String cupBody) {
		CupBody = cupBody;
	}

	void drink() {
		System.out.println(CupString + Cup + CupBody);
	}
}