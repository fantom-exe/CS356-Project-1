class Student {
	private String ID;
	
	Student(String ID) {
		this.ID = ID;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	
	// Answers
	private char multChoiceAns;
	private boolean trueFalseAns;
	
	// Set answers
	public void setMultChoiceAns(char answer) {
		multChoiceAns = answer;
	}
	
	public void setTrueFalseAns(boolean answer) {
		trueFalseAns = answer;
	}
	
	// Get answers
	public char getMultChoiceAns() {
		return multChoiceAns;
	}
	
	public boolean getTrueFalseAns() {
		return trueFalseAns;
	}
	
	
}
