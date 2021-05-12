
package assignment;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Birth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> n=new HashSet<>();
		n.add("pizza");
		n.add("burger");
		n.add("dosa");
		n.add("briyani");
		
		System.out.println("Unorderd "+n);
		
		LinkedHashSet<String> ln=new LinkedHashSet<String>();
		ln.add("happy");
		ln.add("sad");
		ln.add("angry");
		ln.add("sour");		
		System.out.println("Orderd "+ln);
		
	}

}

