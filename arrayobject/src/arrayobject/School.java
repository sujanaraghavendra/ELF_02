package arrayobject;

public class School
{
	String  sname;
	int rollno;
	int Class;
	

	public School(String sname, int rollno, int Class) {
	
		this.sname = sname;
		this.Class= Class;
		this.rollno=rollno;
	}
		
	public String toString() 
	{
		return "Student name:"+this.sname+" "+"Rollno:"+this.rollno+"Class:"+this.Class;
	}
		

	public static void main(String[] args)
	{
		School arr[]= {new School("ravi",1,3),
				new School("sourav",78,9),
				new School("vineet",23,10)};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		// TODO Auto-generated method stub
		}
	}


