package Q;

import java.util.HashSet;  
import java.util.Iterator; 

public class Demo {
	
     public static void main(String args[]){   
    	 
        HashSet<String> h=new HashSet();  // Implementing HashSet  
        
               h.add("Apple");    //Adding elements  
               h.add("Cat");      
               h.add("Elephant");     
               h.add("Blue");    
               h.add("Dog"); 
               h.add("anu");
               
               Iterator<String> i=h.iterator();  // Traversing objects  
               
               while(i.hasNext())  // Return true if the Scanner has another token input  
               {    
               System.out.println(i.next()); // printing elements   
               }    
     }    
}  
