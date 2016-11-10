//class 
abstract class Code {
	private double score;
	private String sourceCode;
	private String comment;

	Code() {}
	public void compile() {         // compile the code using cmd
	}
	public void display() {                     //** Interface 3 to plagiarism team.
		//String str = this.getSourceCode();
		// display the source code.
	}
	public void setComments() {
		// allow the grader to comment the code and write the comment into a file. 
	}
	public void grade() {
		double temp = this.getScore();
		// update the grade file 
	}
	public void update() {   
		// update the comments file and grade file.
		// the graph group use the grade file to read and graph it  ** Interface 2
	}
}


