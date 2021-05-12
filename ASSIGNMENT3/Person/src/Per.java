package Qu;

public class Per implements Comparable<Per>{
	
	String n;
	Integer w;
	Integer h;
	
	
	 public Per(Integer h,Integer w, String n)
	{
		super();
		this.h=h;
		this.w= w;
		this.n = n;
	}
	
	public Integer getH() {
		return h;
	}
	public Integer getW() {
		return w;
	}
    public String getN() {
    	return n;
    }
    public String toString()
    {
    	return"Person [name is "+n+", Height is "+h+", Weight is "+w+"]";
    }
    
    public int compareTo(Per o) {
    	if(this.getW()==o.getW())
    		return this.getH().compareTo(o.getH());
    	else
    		return this.getW().compareTo(o.getW());
    }
}

