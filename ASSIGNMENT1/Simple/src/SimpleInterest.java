import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		double amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a principle");
		int p = sc.nextInt();
		System.out.println("Enter a rate");
		double r = sc.nextDouble();
		System.out.println("Enter a time");
		int t = sc.nextInt();
		
		amt=(p*r*t)/100;
		System.out.println("The amount is"+" " + amt);

	}

}
