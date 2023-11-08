package Day_4;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
//  ----Outer Class and Inner Class accessing ------------------------------------
//		A s=new A();
//		A.B s1=new A().new B();
//		A.B.D s3=new A().new B().new D();
//		A.C s2=new A().new C();
//		s.display();
//		s1.display2();
//		s2.display3();
//		s3.display4();
//	---------------------------------------------------------------------------------
		
		
//--------Student details------------------------------------------------------------		
//		String name=in.next();
//		String USN=in.next();
//		int age=in.nextInt();
//		student s1=new student(name,USN,age);
//		s1.std1();
//----------------------------------------------------------------------------------
		
//----Employee datails------------------------------------------------------------
//		
//		while (true) {
//		System.out.println("Enter number to select:");
//		int ch=in.nextInt();
//		switch(ch) {
//		case 1:employee e1=new employee("Roy","354",535132);
//		break;
//		case 2:employee e2=new employee("Ratan","897",700000);
//		break;
//		case 3:employee e3=new employee("Raman","987",321500);
//		break;
//	}
//	}
	}

}
//------------------------------------------------------------------------------------

//----Student details-----------------------------------------------------------------
//class student{
//	String name;
//	String USN;
//	int age;
//	public student(String name,String USN,int age) {
//		System.out.println("Name is "+name);
//		System.out.println("USN is "+USN);
//		System.out.println("Age is " +age);
//		this.name=name;
//		this.USN=USN;
//	}
//	public void std1() {
//		System.out.println(name+ " "+USN);
//	}
//}
//---------------------------------------------------------------------------------

//class employee{
//	String name;
//	String empId;
//	int salary;
//	public employee(String name,String empId,int salary) {
//		
//		this.name=name;
//		this.empId=empId;
//		this.salary=salary;
//		System.out.println("Name is "+name);
//		System.out.println("ID is "+empId);
//		System.out.println("Salary is " +salary);
//	}
//	public void emp1() {
//		System.out.println(name+ " "+empId);	
//	}
//}
//--------------------------------------------------------------------------------------------

// Inner Classes accessing--------------------------------------------------------------------
//class A{
//	class B{
//		class D{
//			void display4() {
//				System.out.println("This is fourth class");
//			}
//		}
//		void display2() {
//			System.out.println("My name is Ratan");
//		}
//	}
//	class C{
//		void display3() {
//			System.out.println("This is CSE branch");
//
//		}
//	}
//	void display() {
//		System.out.println("Hello");
//	}
//}
//--------------------------------------------------------------------------------------------
