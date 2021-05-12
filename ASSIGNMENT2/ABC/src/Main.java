
public class Main {

	public static void main(String[] args) 
	{
		Manager m1 = new Manager("Ram", 20000,500,1500);
		Manager m2 = new Manager("mohan", 2000,500,500);
		System.out.println("salary of emp  "+m1.name+" is :"+m1.getIncentive());
		System.out.println("salary of emp  "+m2.name+" is :"+m2.getIncentive());
		System.out.println();
		Labour l1 = new Labour("Ram",10);
		Labour l2 = new Labour("Mohan", 8);
		System.out.println("overtime of labour  "+l1.name+" is :"+l1.getOverTime());
		System.out.println("overtime of labour  "+l2.name+" is :"+l2.getOverTime());
	}

}

