import java.util.*;
class Duplicate
{
	void removeDup(String str)
	{
		//char[] array=str.toCharArray();
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
	    for(int i=0;i<str.length();i++)			
		{
			ls.add(str.charAt(i));
		}			
		
		Iterator itr=ls.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}
}

class mainClass
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	Duplicate d=new Duplicate();
	d.removeDup(str);
  }
}