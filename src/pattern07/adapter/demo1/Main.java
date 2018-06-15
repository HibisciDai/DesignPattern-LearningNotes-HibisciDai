package pattern07.adapter.demo1;

public class Main {
	public static void main(String[] args) {
		IPicture p = new PictureAdapter();
		p.getRGB();
	}
}