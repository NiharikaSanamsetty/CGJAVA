package lam;

import java.util.Scanner;

public class Ope{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First number");
		int x = sc.nextInt();
		System.out.println("Second number");
		int y= sc.nextInt();

		Sum add = (a, b) -> a + b;
        System.out.println("for addition=" + add.operation(x, y));
        
        Sum sub = (a, b) -> a - b;
		System.out.println("for subsraction=" + sub.operation(x, y));

		Sum mul = (a, b) -> a * b;
		System.out.println("for multiplication=" + mul.operation(x, y));

		Sum div = (a, b) -> a / b;
		System.out.println("for division=" + div.operation(x, y));

		
		

	}

}

interface Sum {
	float operation(int x, int y);
	}



