
class Manager extends Employee 
{
	int hra,ta;
	Manager()
	{
		super();
		hra=ta=0;
	}
	Manager(String n, int sal, int h, int t)
	{
		super(n,sal);
		hra=h;
		ta=t;
	}
	int getIncentive()
	{
		return (super.getIncentive()+hra+ta);
	}
}

