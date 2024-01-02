package arrayobject;

public class Emp 
{
	String ename;
	int eid;
	double salary;
	

	public Emp(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}


	public static void main(String[] args)
	{
		Emp e1=new Emp("sujana",1,3500);
		Emp e2=new Emp("suj",2,3600);
		Emp e3=new Emp("sujana1",3,3700);
		
		Emp arr[]=new Emp[3];
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("ename:"+arr[i].ename+" "+"eid:"+arr[i].eid+" "+"salary:"+arr[i].salary);
			//System.out.println(arr[i]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
