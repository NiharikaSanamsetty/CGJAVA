package as;

import java.util.ArrayList;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> n = new ArrayList<>();

		n.add("pizza");
		n.add("icecream");
		n.add("noodles");
		n.add("beverge");
		
		n.replaceAll(t -> t.toUpperCase());

		System.out.println(n);
	}

}

