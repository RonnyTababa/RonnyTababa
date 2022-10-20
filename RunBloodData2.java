import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
    	BloodData bd = new BloodData();
        Scanner SC = new Scanner(System.in);
        String input1, input2;
        String data;
        
        System.out.print("Enter blood type of patient: ");
        input1 = SC.nextLine();
        System.out.print("Enter the Rhesus Factor (+ or -): ");
        input2 = SC.nextLine();
        data = input1 + input2;
        
        if (data.isEmpty()){
        	bd.setBloodType("O");
        	bd.setRhFactor("+");
        	System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank" );
        }
        else if (data.equals("A+") || data.equals("A-") || data.equals("B+") || data.equals("B-") || data.equals("O+") || data.equals("O-") || data.equals("AB+") || data.equals("A-")){
        	bd.setBloodType(input1);
        	bd.setRhFactor(input2);
        	System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank" );
        }
        else {
        	System.out.println("Invalid Input");
        }SC.close();
    }
}
