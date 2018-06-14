package pattern06.prototype.demo1;

public class ExamPaper implements Cloneable {
	String name;

	public ExamPaper() {
	}

	public ExamPaper(String name) {
		this.name = name;
	}

	public void showExam() {
		System.out.println("ExamPaper-" + name);
	}

	public ExamPaper myClone() {
		ExamPaper ep = null;
		try {
			ep = (ExamPaper) this.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ep;
	}
}