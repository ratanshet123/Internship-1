package Day_2;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
//		Student Marks
//		--------------------------------------------------
//		System.out.println("Enter the marks of student:");
//		int marks= in.nextInt();
//		if(marks>=90 && marks<=100) {
//			System.out.println("Grade:A");
//		}
//		else if( marks>=70 && marks<=89 ) {
//			System.out.println("Grade:B");
//		}
//		else if( marks>=60 && marks<=69 ) {
//			System.out.println("Grade:C");
//		}
//		else if( marks>=50 && marks<=59 ) {
//			System.out.println("Grade:D");
//		}
//		else  {
//			System.out.println("Grade:E");
//		}
		
		
//		BMI
//-----------------------------------------------------------------
		System.out.println("Enter weight(in Kgs)");
		double weight=in.nextFloat();
		System.out.println("Enter height(in meters)");
		double height=in.nextFloat();
		double bmi = (weight) / (height*height);
		if (bmi<=15) {
			System.out.println("BMI is"+bmi);
			System.out.println(" Very Severely underweight");
		}
		else if(bmi>15 && bmi<=16) {
			System.out.println("BMI is"+bmi);
			System.out.println(" Severely underweight");
		}
		else if(bmi>=16 && bmi<18.5) {
			System.out.println("BMI is"+bmi);
			System.out.println("Underweight");
		}
		else if(bmi>=18.5 && bmi<25) {
			System.out.println("BMI is"+bmi);
			System.out.println(" Normal (healthy weight)");
		}
		else if(bmi>=25 && bmi<30) {
			System.out.println("BMI is"+bmi);
			System.out.println("Overweight");
		}
		else if(bmi>=30 && bmi<35) {
			System.out.println("BMI is"+bmi);
			System.out.println("Moderately Obese");
		}
		else if(bmi>=35 && bmi<40) {
			System.out.println("BMI is"+bmi);
			System.out.println("Severely Obese");
		}
		else {
			System.out.println("BMI is"+bmi);
			System.out.println("Very Severely Obese");
		}
		
	}

}
