import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int count=0;
for(int i=2;i<n;i++) {
	if(n<2) {
		System.out.println("not prime");
	}
	else {
		if(n%i==0) {
			count++;
		}
	}
}
	if(count==0) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
}
	}

