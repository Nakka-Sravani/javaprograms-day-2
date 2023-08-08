import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter number :");
int n=scan.nextInt();
ReverseNum RN=new ReverseNum();
int res=RN.ReveseApp(n);
System.out.println("reverse of number "+n+" is "+res);
if(n==res) {
	System.out.println(n+" palindrom number");
}
else {
	System.out.println(n+" not palindrom number");
}
}

}
