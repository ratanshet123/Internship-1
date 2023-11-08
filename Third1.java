package Day_3;

import java.util.Scanner;

// Default Constructor-------------------------------------
//class example{
//	public example() {
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter values of a and b:");
//		int a=in.nextInt();
//		int b=in.nextInt();
//		int sum=a+b;
//		System.out.println("The sum of a and b is "+sum);
//	}
//	public void display() {
//		System.out.println("This ia a constructor");
//	}
//}
//		
//----------------------------------------------------------


//Parameterized constructor-------------------------------------------------------------------

class example{
	public example(int a, int b) {
		int sum=a+b;
		System.out.println("The sum of a and b is " +sum);
	}

}

//---------------------------------------------------------------------------------------------

public class Third1 {
	//	Methods with parameters and return values------------------------------------
	//	public int add(int a,int b) {
	//
	//		int sum=a+b;
	//		return sum;
	//	}
	//	-----------------------------------------------------------------------------

	//Methods with parameters and no return values-----------------------------------
	//			public void display(int a,int b) {
	//				Scanner in=new Scanner(System.in);
	//				a=in.nextInt();
	//				b=in.nextInt();
	//				int sub=(a-b);
	//				System.out.println(sub);
	//			}
	//	-------------------------------------------------------------------------------

	//	Methods with no parameters and  return values-------------------------------------------
	//	public int multiply() {
	//		Scanner sc=new Scanner(System.in);
	//		int a=sc.nextInt();
	//		int b=sc.nextInt();
	//		int sum=a*b;
	//		return sum;
	//	}
	//	--------------------------------------------------------------------------------------

	//Methods with no parameters and no return values-----------------------------------
	//	
	//						public void display1() {
	//							Scanner in=new Scanner(System.in);
	//							int a=in.nextInt();
	//							int b=in.nextInt();
	//							int div=(a/b);
	//							System.out.println(div);
	//						}
	//	
	//	----------------------------------------------------------------------------


	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		//	Methods with parameters and return values------------------------------------	
		//		
		//		int a=in.nextInt();
		//		int b=in.nextInt();
		//		Third1 t=new Third1();
		//		int c=t.add(a, b);
		//		System.out.println(c);
		//		
		//----------------------------------------------------------------------------------

		//	Methods with parameters and no return values------------------------------------
		//
		//						
		//		Third1 t1=new Third1();
		//		t1.display(0, 0);
		//						
		//
		//---------------------------------------------------------------------------------------

		//	Methods with no parameters and  return values-------------------------------------------
		//
		//		Third1 t1=new Third1();
		//		int d=t1.multiply();
		//		System.out.println(d);
		//		
		//	----------------------------------------------------------------------------------

		//	Methods with no parameters and no return values------------------------------------
		//
		//						
		//				Third1 t1=new Third1();
		//				t1.display1();
		//		
		//---------------------------------------------------------------------------------------

		//		Default Constructor----------------------------------------------------------------------------------
		//		
		//				 example e1=new example();
		//				 e1.display();
		//	 
		//		 --------------------------------------------------------------------------------------


		//		Parameterized Constructor----------------------------------------------------------------------------------
		//		
							example e1=new example( 5,6);

		//	 
		//		 --------------------------------------------------------------------------------------






	}

}
