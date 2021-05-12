class Single
{
    
    private static Single single_instance = null;
  
    
    public String s;
  
   
    private Single()
    {
        s = "Hello I am a string part of Singleton class";
    }
  
    
    public static Single getInstance()
    {
        if (single_instance == null)
            single_instance = new Single();
  
        return single_instance;
    }
}
  

class Main
{
    public static void main(String args[])
    {
       
        Single x = Single.getInstance();
  
        
        Single y = Single.getInstance();
  
        
        Single z = Single.getInstance();
  
        
        x.s = (x.s).toUpperCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
        
        z.s = (z.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
