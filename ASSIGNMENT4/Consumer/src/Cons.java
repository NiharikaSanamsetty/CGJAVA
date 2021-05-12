package as;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Consumer<String> firstC = x -> System.out.println(x.toLowerCase());
	     Consumer<String> secondC = y -> System.out.println(y.toUpperCase());
	 
	     Consumer<String> result = firstC.andThen(secondC);
	 
	    result.accept("kitty");
	 }
	
	}
class JavaPrediction {  
    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 18); 
        System.out.println(pr.test(18));      
    }  
}


class JavaSupplier {

	 
	 public static void main(String[] args) {
	 
	  Supplier<String> supplier= ()-> "kitty";
	  System.out.println(supplier.get());
	 }
	}


