package pattern07.adapter.demo2;

public class MyPicture implements IPicture {
	@Override
	public void getRGB() {
		System.out.println("MyPicture-" + "getRGB");
	}
}