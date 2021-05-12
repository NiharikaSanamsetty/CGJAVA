package as;

import java.util.Arrays;

public class Letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb=new StringBuilder();
		
		Arrays.asList("pizza","fries","tandoor","drinks")
		.forEach(n->sb.append(n.charAt(0)));
		
		System.out.println(sb);
	}

}
