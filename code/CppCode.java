class CppCode extends Code {
	JavaCode() {
		super();
	}
	public double getScore() {
		return this.score;
	}
	public void setScore(double scr) {
		this.score = scr;
	}
	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	public void compile() {         // compile the code using cmd
	}
	public void display() {                     //** Interface 3 to plagiarism team.
		//String str = this.getSourceCode();
		// display the source code.
	}
	public double score(double score) {
		this.score = score;
		// allow the grader to grade the code based on the result. 
	}
	public void setComments() {
		String repeatChar = "t";
		do{
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the comments: ");
			comment = input.nextLine();
			System.out.println("The comment you set is " + comment + " (enter t/T for Ture or f/F for False).");
			repeatChar = input.next();
		}while(repeatChar.charAt(0) == 'F' || repeatChar.charAt(0) == 'f');
		// allow the grader to comment the code and write the comment into a file. 
	}
	public void grade() {
		String repeatChar = "t";
		do{
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the grade: ");
			score = input.nextDouble();
			System.out.println("The grade you set is " + score + " (enter t/T for Ture or f/F for False).");
			repeatChar = input.next();
		}while(repeatChar.charAt(0) == 'F' || repeatChar.charAt(0) == 'f');
		// update the grade file 
	}
	public void update() throws IOException {
		FileWriter fwc = new FileWriter("comment.txt");
		BufferedWriter bufwc = new BufferedWriter(fwc);
		bufwc.write(comment);
		bufwc.flush();
		bufwc.close();
		FileWriter fwg = new FileWriter("grade.txt");
		BufferedWriter bufwg = new BufferedWriter(fwg);
		bufwg.write(score + "");
		bufwg.flush();
		bufwg.close();
		// update the comments file and grade file.
		// the graph group use the grade file to read and graph it  ** Interface 2
	}

}
