import java.util.Scanner;
public class CollegeList {
    
    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);
        
        double input5;
        int input4;
        String input1,input2, input3;
        String choice;
        
        System.out.print("Press E for Employee, F For Faculty, or S for Student: ");
        choice = SC.nextLine();
        
        if (choice.equalsIgnoreCase("E")) {
        	Employee e = new Employee();
        	System.out.println("Type Name, Contact Number, Salary, Department.\nPress enter after every input.");
        	input1 = SC.next();
        	input3 = SC.next();
        	input5 = SC.nextDouble();
        	input2 = SC.next();
        	
        	e.setName(input1);
        	e.setContactNum(input3);
        	e.setSalary(input5);
        	e.setDepartment(input2);
        	
        	System.out.println("Name: " + e.getName());
        	System.out.println("Contact Number: " + e.getContactNum());
        	System.out.println("Salary: " + e.getSalary());
        	System.out.println("Department: " + e.getDepartment());
        }
        else if (choice.equalsIgnoreCase("S")) {
        	Student s = new Student();
        	System.out.println("Type Name, Contact Number, Program, YearLevel.\nPress enter after every input.");
        	input1 = SC.next();
        	input3 = SC.next();
        	input2 = SC.next();
        	input4 = SC.nextInt();
        	
        	s.setName(input1);
        	s.setContactNum(input3);
        	s.setProgram(input2);
        	s.setYearLevel(input4);
        	
        	System.out.println("Name: " + s.getName());
        	System.out.println("Contact Number: " + s.getContactNum());
        	System.out.println("Program: " + s.getProgram());
        	System.out.println("Year Level: " + s.getYearLevel());
        }
        else if (choice.equalsIgnoreCase("F")) {
        	Faculty f = new Faculty();
        	System.out.println("Type Name, Contact Number, Salary, Department.\nPress enter after every input.");
        	input1 = SC.next();
        	input3 = SC.next();
        	input5 = SC.nextDouble();
        	input2 = SC.next();
        	
        	f.setName(input1);
        	f.setContactNum(input3);
        	f.setSalary(input5);
        	f.setDepartment(input2);
        	
        	String choice1;
        	
        	System.out.println("Press Y if your are regular and N not regular: ");
        	choice1 = SC.next();
        	
        	if (choice1.equalsIgnoreCase("Y")) {
        		System.out.println("Name: " + f.getName());
        		System.out.println("Contact Number: " + f.getContactNum());
        		System.out.println("Salary: " + f.getSalary());
        		System.out.println("Department: " + f.getDepartment());
        		System.out.println(f.status());
        	}
        	else if (choice1.equalsIgnoreCase("N")) {
        		System.out.println("Name: " + f.getName());
        		System.out.println("Contact Number: " + f.getContactNum());
        		System.out.println("Salary: " + f.getSalary());
        		System.out.println("Department: " + f.getDepartment());
        		System.out.println(f.status());
        	}
        	else {
        		System.out.println("Invalid Input");
        	}	
        }
        else {
        	System.out.println("Invalid Input");
        }
    }
}
