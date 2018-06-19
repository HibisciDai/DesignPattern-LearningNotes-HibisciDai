package pattern09.composite.demo1;

public abstract class AbstractFile {
	protected String fname;

	public AbstractFile(String fname) {
		super();
		this.fname = fname;
	}

	abstract void add(AbstractFile abstractFile);

	abstract void remove(AbstractFile abstractFile);

	abstract void printName();

	void operation() {
		System.out.println("文件其他操作...");
	}
}