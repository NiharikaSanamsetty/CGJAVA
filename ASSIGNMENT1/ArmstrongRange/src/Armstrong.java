import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		int c=0,a,tem;
		System.out.println("Enter a number that you check:");
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		tem=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(tem==c)
			System.out.println("It is an Armstrong Number.");
		else
			System.out.println("It is not an Armstrong Number.");
	}

}
