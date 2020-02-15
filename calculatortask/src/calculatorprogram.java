import java.util.Scanner;
public class JavaExample {
	public static void main(string[] args) {
		double num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter first number:")
		num1=scanner.nextDouble();
		System.out.print("enter second number:");
		num2=scanner.nextDouble();
		System.out.print("enter an operator(+,-,*,%):");
		char operator=scanner.next().charAt(0);
		scanner.close();
		double output;
		switch(operator)
		{
		case '+':
	    	output=num1+num2;
	    	break;
		case '-':
	    	output=num1-num2;
	    	break;
		case '*':
	    	output=num1*num2;
	    	break;
		case '%':
	    	output=num1%num2;
	    	break;
	    default:
	    	System.out.printf("it is an operator");
	    	return;
	   }
		System.out.println(num1+""+operator+""+num2);
	}
	
}