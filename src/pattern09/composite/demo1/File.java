package pattern09.composite.demo1;

public class File extends AbstractFile {

	public File(String fname) {
		super(fname);
	}

	@Override
	void add(AbstractFile abstractFile) {
		System.out.println("File" + "添加");
	}

	@Override
	void remove(AbstractFile abstractFile) {
		System.out.println("File" + "移除");
	}

	@Override
	void printName() {
		System.out.println("File" + fname);
	}
}