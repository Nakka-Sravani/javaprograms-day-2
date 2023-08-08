import java.util.Scanner;

public class Even_Div_3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		EvenDiv(n);
	}
	public static void EvenDiv(int n){
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%3==0) {
			System.out.println(i);
			}
			}
	}	
}

