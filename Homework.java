package Day_3;
import java.util.*;
class employee{
	String name,empID,salary,pf;
	Scanner in=new Scanner(System.in);
	public void empdetails() {
		System.out.println("Enter employee name:");
		 name=in.next();
		System.out.println("Enter employee ID:");
		 empID=in.next();
		System.out.println("Enter employee salary:");
		 salary=in.next();
		System.out.println("Enter pf amount:");
		 pf=in.next();
	}
	public void display() {
		System.out.println("");
		System.out.println("Employee name: " + name);
		System.out.println("Employee ID: "+ empID);
		System.out.println("Employee salary: "+salary);
		System.out.println("PF amount: "+pf);
		
	}
}

public class Homework {

	public static void main(String[] args) {
		employee emp=new employee();
		System.out.println("Enter employee details");
		emp.empdetails();
		System.out.println("Employee details");
		emp.display();
		

	}

}
