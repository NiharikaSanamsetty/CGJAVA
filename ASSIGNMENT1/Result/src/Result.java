import java.util.Scanner;

public class Result {
	int x1,x2,x3;
	private void Sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the m of sub m1:");
		int x1 = sc.nextInt();
		System.out.println("Enter the m of sub m2:");
		int x2 = sc.nextInt();
		System.out.println("Enter the m of sub m3:");
		int x3 = sc.nextInt();
		
		System.out.println("The marks of a:"+x1);
		System.out.println("The marks of b:"+x2);
		System.out.println("The marks of c:"+x3);
		
		if(x1>=60 && x2>=60 && x3>=60) {
			System.out.println("passed");}
		else if(x1>=60 && x2>=60 || x1>=60 && x3>=60 || x2>=60 && x3>=60) {
			System.out.println("promoted");}
		else {
			System.out.println("failed");
		}
		
		}

	}


