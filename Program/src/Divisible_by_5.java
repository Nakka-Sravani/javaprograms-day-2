import java.util.Scanner;

public class Divisible_by_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println(i+" ");
			} 
		}	
	}
}
