package pattern07.adapter.demo2;

public class Main {
	public static void main(String[] args) {
		IPicture p = new PictureAdapter();
		p.getRGB();
	}
}