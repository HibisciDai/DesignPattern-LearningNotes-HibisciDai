package pattern09.composite.demo1;

import java.util.ArrayList;

public class Folders extends AbstractFile {

	ArrayList<AbstractFile> afs = new ArrayList<AbstractFile>();

	public Folders(String fname) {
		super(fname);
	}

	@Override
	void add(AbstractFile abstractFile) {
		afs.add(abstractFile);
		System.out.println("Folders" + "添加");
	}

	@Override
	void remove(AbstractFile abstractFile) {
		afs.remove(abstractFile);
		System.out.println("Folders" + "添加");
	}

	@Override
	void printName() {
		System.out.println("Folders" + fname);
		for (AbstractFile af : afs) {
			af.printName();
		}
	}
}