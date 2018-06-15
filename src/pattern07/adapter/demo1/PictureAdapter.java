package pattern07.adapter.demo1;

public class PictureAdapter implements IPicture {
	@Override
	public void getRGB() {
		NewPicture np = new NewPicture();
		np.getR();
		np.getG();
		np.getB();
	}
}