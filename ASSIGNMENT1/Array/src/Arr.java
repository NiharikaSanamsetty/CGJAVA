import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int va = sc.nextInt();
		int fg=0;
		
		for (int x = 0; x < a.length; x++) {
			
			if(a[x]==va) {
				System.out.println(va + "is found");
				fg=1;
				break;
			}
		}if(fg==0)
		{
			System.out.println(va + "is not found");
		}

	}

}
