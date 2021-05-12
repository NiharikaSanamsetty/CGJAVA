import java.util.Arrays;

public class BubbleSort {
	static void bubble(int ar[]) {
		int n=ar.length;
		int tem=0;
		
		for(int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				if(ar[j-1]>ar[j]) {
					tem=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		

	}
	public static void main(String[] args) {
		int ar[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		bubble(ar);
	}

}
