import java.util.Scanner;
public class RunBloodData{
	static String bloodType;
	static String rhFactor;
	public static void main(String[] args){
		Scanner SC = new Scanner (System.in);
		
		System.out.print("Enter blood type of patient: ");
		String bloodType = SC.nextLine();
		System.out.print("Enter the Rhesus factor (+ or -): ");
		String rhFactor = SC.nextLine();
		
		if (bloodType.equals("") && rhFactor.equals("")){
			BloodData bd = new  BloodData();
			bd.display();
		}
		else if (bloodType.equals ("A") || bloodType.equals  ("B") || bloodType.equals  ("O") || bloodType.equals  ("AB") && rhFactor.equals ("+") || rhFactor.equals ("-")){
			BloodData bd = new  BloodData(bloodType, rhFactor);
			bd.display();
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}