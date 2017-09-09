import java.util.*;

class reverseOrder
{
     void print(ArrayList<String> al,int totalstring)
	 {
		 int i=0;
		 int n=totalstring;
		 for(i=n/2;i<n;i++)
	     {
			 System.out.println(al.get(i));
		 }
		 
		 for(i=0;i<(n/2);i++)
	     {
			 System.out.println(al.get(i));
		 }
		 
		 
		 
	 }		 
}

class mainClass
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int totalstring=0;
		while(str.length()!=0)
		{
			totalstring++;
			al.add(str);
			str=sc.nextLine();
		}
		reverseOrder ro=new reverseOrder();
		ro.print(al,totalstring);
	}
	
}