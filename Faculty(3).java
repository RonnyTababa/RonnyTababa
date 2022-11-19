public class Faculty extends Employee{
	private boolean status;
	public boolean isRegular;
	
	Employee e = new Employee();
	
	boolean status() {
		if (isRegular == true) {
			return status == true;
		}
		if (isRegular == false) {
			return status == false;
		}
		return status;
	}
}