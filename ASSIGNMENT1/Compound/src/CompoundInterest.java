import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		double amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a principle");
		int p = sc.nextInt();
		System.out.println("Enter a rate");
		double r = sc.nextDouble();
		System.out.println("Enter a day");
		int n = sc.nextInt();
		
		for(int n1=1;n1<=10;n1++) {
		amt=p*Math.pow(1+r, n1);
		System.out.println("The amount is" +" "+ n1 +" "+amt);
		}
	}
}
