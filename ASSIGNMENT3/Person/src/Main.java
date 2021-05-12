package Qu

import java.util.TreeSet;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		 TreeSet<Per> ts = new TreeSet<>();
		 ts.add(new Per(120,45,"Abc"));
		 ts.add(new Per(110,35,"Afu"));
		 ts.add(new Per(160,65,"kla"));
		 ts.add(new Per(130,65,"pum"));
		 ts.add(new Per(105,25,"Drif"));
		 
		 for(Per element : ts)
			 System.out.println(element);
		 
	}

}

