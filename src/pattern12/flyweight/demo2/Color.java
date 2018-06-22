package pattern12.flyweight.demo2;

public class Color {
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Color() {
		super();
	}

	public Color(String key) {
		this.color = key;
	}

	@Override
	public String toString() {
		return color;
	}
}