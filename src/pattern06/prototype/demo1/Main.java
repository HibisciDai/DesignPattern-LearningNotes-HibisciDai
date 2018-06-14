package pattern06.prototype.demo1;

public class Main {
	public static void main(String[] args) {
		ExamPaper ep = new ExamPaper();
		ep.name = "小明";
		ep.showExam();

		ExamPaper ep1 = ep.myClone();
		ep1.name = "小红";
		ep1.showExam();

		ExamPaper ep2 = ep.myClone();
		ep2.name = "小黑";
		ep2.showExam();
	}
}