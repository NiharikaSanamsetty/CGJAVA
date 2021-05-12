package Question2;

import java.util.Iterator;  
import java.util.LinkedHashSet;  
  
public class Link {   
	
     public static void main(String args[]){ 
    	 
            LinkedHashSet<String> lh=new LinkedHashSet(); // Implementing HashSet     
                   lh.add("Apple");    // Adding elements  
                   lh.add("Cat");      
                   lh.add("Elephant");
                   lh.add("anu");
                   lh.add("Blue");    
                   lh.add("Dog");  
                   lh.add("Fast");
                   
                   Iterator<String> i=lh.iterator(); // Traversing objects    
                   
                   while(i.hasNext()) // Return true if the Scanner has another token input    
                   {    
                   System.out.println(i.next());// printing elements     
                   }    
     }    
    }   

