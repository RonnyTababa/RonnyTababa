class Employee extends Person {
	private double salary;
	private String department;
	
	Person p = new Person();
	
	public void setDepartment(String d) {
    	this.department = d;
    }
    
    public void setSalary(double s) {
    	this.salary = s;
    }
    
    public double getSalary() {
    	return salary;
    }
    
    public String getDepartment() {
    	return department;
    }
}