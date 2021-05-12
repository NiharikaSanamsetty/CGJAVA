package as;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> T = new ArrayList<Integer>();
	        T.add(4);
	        T.add(43);
	        T.add(16);
	        
	        Thread n = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                
	                T.stream().forEach(t -> System.out.println(t));
	            }
	        });
	        n.run();
	    }
	}

