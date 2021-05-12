package assg;

import java.util.ArrayList;

public class od {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>n=new ArrayList<String>();
		
		n.add("Greek");
		n.add("Mouse");
		n.add("Jer");
		n.add("Spake");
		n.add("Grency");
		
		
		System.out.println(n);
		
		n.removeIf(t->(t.length()%2==1));
		System.out.println(n);
		
//		 na.stream()
//		.filter(p->(p.length()%2==1))
//		.forEach(p->System.out.println("\n"+p));

		
		}
		
	}
