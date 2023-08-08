import java.util.Scanner;

public class FactorialNumber {

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter number");
int n=scan.nextInt();
System.out.println("factorial of "+n+" is : "+fact(n));
	}
public static int fact(int n) {
	if(n==0) {
		return 1;
	}
	else {
		int fact=1;
		for(int i=n;i>=1;i--) {
		 fact=fact*i;
		}
		return fact;
	}
	}
}


