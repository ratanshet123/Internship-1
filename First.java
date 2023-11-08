package Day_1;
import java.util.*;

public class First {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
//		System.out.println("Hello World!");
//		int a = 5;
//		float b = 5.5f;
//		double c = 34.54d;
//		byte d = 2;
//		short e = 6;
//		boolean f = true;
//		long g = 234;
//		char h = 'p';
//		System.out.println(g);
//		System.out.println(Short.MIN_VALUE);
//		System.out.println(Short.MAX_VALUE);
//		--------------------------------------------------------------------------------------
		int a,b,ch,res;
		while(true) {
		System.out.println("Enter a:");
		a = in.nextInt();
		System.out.println("Enter b:");
		b= in.nextInt();
		System.out.println("Enter choice:");
		ch=in.nextInt();
		switch(ch) {
		case 1:  res=a+b;
		System.out.println("The sum is " +res);
		break;
		case 2:  res=a-b;
		System.out.println("The difference is " +res);
		break;
		case 3:  res=a*b;
		System.out.println("The product is " +res);
		break;
		case 4:  res=a/b;
		System.out.println("The division is " +res);
		break;
		default: System.out.println("Invalid Choice");
		}
		}
	}

}
