import java.util.Scanner;

public class DisplayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to print numbers from 1 to until where to stop");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
