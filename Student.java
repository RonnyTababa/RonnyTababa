class Student extends Person {
	private String program;
	private int yearLevel;
	
	Person p = new Person();
	
	public void setProgram(String p) {
		this.program = p;
	}
    
    public void setYearLevel(int y) {
    	this.yearLevel = y;
    }
    
    public String getProgram() {
    	return program;
    }
    
    public int getYearLevel() {
    	return yearLevel;
    }
}