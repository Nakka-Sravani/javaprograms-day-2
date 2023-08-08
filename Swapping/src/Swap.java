import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 numbers: ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println("Before Swapping ");
		System.out.println(x+" "+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping:");
		System.out.println(x+" "+y);
	}

}
