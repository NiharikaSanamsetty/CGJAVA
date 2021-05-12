
package as;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Amount");
		
		int price=sc.nextInt();
		
		if(price>10000)
		{
		 System.out.println(" Order Accepted");
		    
		}
		else
		{
			System.out.println("Oder denied");
			
			}
	}

}
