import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter two numbers");
int n=scan.nextInt();
int m=scan.nextInt();
System.out.println("Gcd OF "+m+" and"+n+ " is :"+GCD.FindGcd(m, n));
	}

}
