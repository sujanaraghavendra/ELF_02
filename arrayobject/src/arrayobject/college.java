package arrayobject;
import java.util.*;

public class college 
{
	String sname;
	int regdno;
	String branch;
	

	public college(String sname, int regdno, String branch) {
		super();
		this.sname = sname;
		this.regdno = regdno;
		this.branch = branch;
	}
	


	@Override
	public String toString() {
		return "college [sname=" + sname + ", regdno=" + regdno + ", branch=" + branch + "]";
	}



	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		college arr[]=new college[size];
		System.out.println("enter the details");
		for(int i =0;i<arr.length;i++)
		{
			sc.nextLine();
			System.out.println("enter the name");
			String sname=sc.nextLine();
			System.out.println("enter the regdno");
			int regdno=sc.nextInt();
			System.out.println("enter the branch");
			String branch=sc.next();
			arr[i]=new college(sname,regdno,branch);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
