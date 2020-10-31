import java.util.*;
public class SwitchWithStringExample {

	public static void main(String[] args) throws Exception {
		System.out.println("enter two values");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("enter the Choice");
		String op=sc.next();
		
		switch(op)
		{
		
		case "Add" :c=a+b;
		System.out.println("Sum="+c);
		break;
		
		case "Sub" :c=a-b;
		System.out.println("Sub="+c);
		break;
		
		case "Mul" :c=a*b;
		System.out.println("Mul="+c);
		break;
		
		case "Div" :c=a/b;
		System.out.println("Div="+c);
		break;
		
		default:
		System.out.println("None of the Above");	
		}
		
		 

	}

}
