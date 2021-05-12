
public class Armrange {

	public static void main(String[] args) {
		int i,a,n,ar=0;
		System.out.println("Armstrong number between 100 to 999 are");
		for(i=100;i<=1000;i++)
		{
		n=i;
		ar=0;
		while(n>0)
		{
			a=n%10;
			ar=ar+(a*a*a);
			n=n/10;
		}
		if(ar==i)
			System.out.println(i);
		}

	}

}
