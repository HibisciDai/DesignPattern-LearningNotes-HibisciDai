package pattern07.adapter.demo2;

public class PictureAdapter extends NewPicture implements IPicture {
	@Override
	public void getRGB() {
		NewPicture np = new NewPicture();
		np.getR();
		np.getG();
		np.getB();
	}
}