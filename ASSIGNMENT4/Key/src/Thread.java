package as;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> m=new HashMap<>();
		StringBuilder p=new StringBuilder();
		
		 m.put("shimla", "mountain");
		 m.put("Hilly", "adventure");
		 m.put("Ooty", "peace");
		 
		 
		 
		 Set s1=m.entrySet();
		 System.out.println(s1);
		 
         Iterator n=s1.iterator();
         while(n.hasNext())
         {
        	 Map.Entry m1 =(Map.Entry)n.next();
             String x=(String) m1.getKey()+m1.getValue();
        	 p.append(x);

         }
         
         System.out.println(p);
	}


	}



