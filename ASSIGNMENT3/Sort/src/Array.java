package Q;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
			al.add("Ram");
			al.add("Ti");
			al.add("Aj"); 
			al.add("Al");
			al.add("Pri");
			
			ListIterator<String> list1=al.listIterator(al.size());  
			 while(list1.hasPrevious())  
	         {  
	             String str=list1.previous();  
	             System.out.println(str);  
	         }  
			
}
}

