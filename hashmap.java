
import java.util.*;
class mainclass
{
	public static void main(String[] args)
	{
		 HashMap<Integer,String> mymap=new HashMap<Integer,String>(5);
		 mymap.put(1,"a");
		
		 mymap.put(4,"d");
		  mymap.put(5,"b");
		 mymap.put(3,"c");
		System.out.println(mymap);
		
		for(Map.Entry m:mymap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}