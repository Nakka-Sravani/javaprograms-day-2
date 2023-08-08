import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		int count=0;
		for(int i=3;i<=n;i++) {
			int res=prime(i);
			if(res!=0) {
				System.out.println(res);
				count++;
			}
		}
		System.out.println("number of prime numbers: "+count);
	}
	public static int prime(int n){
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return n;


	} 

}	
