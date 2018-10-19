package project;

public abstract class Questions {

	private int category;
	private int questionNo;
	private int QuestionCounter;
	private int NoMistake=1;
    private int wronganswer=0;

	
	public int getCategory() {
		return category;
	}
	public void setCategory(int myCategory) {
		this.category = myCategory;
	}
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int myQuestionNo) {
		this.questionNo = myQuestionNo;
	}
	
	public int getQuestionCounter(){
		return QuestionCounter;
	}
	
	public void setQuestionCounter(int myQuestionCounter){
		this.QuestionCounter=myQuestionCounter;
	}
	
	public int getNoMistake() {
		return NoMistake;
	}
	public void setNoMistake(int noMistake) {
		NoMistake = noMistake;
	}
	
	
	public int getWronganswer() {
		return wronganswer;
	}
	public void setWronganswer(int wronganswer) {
		this.wronganswer = wronganswer;
	}
	public abstract void Question();
	


}
