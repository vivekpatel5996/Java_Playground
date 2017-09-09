import java.util.*;
class  duplicate
{
    void printDuplicate(String str)
	{
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String[] words=str.split("\\ ");
		int value=1;
		for(String w:words)
		{
			  if(map.containsKey(w))
			  {
				  value=map.get(w);
				  value++;
				  map.put(w,value);
				 
			  }
			  else
			  {
	              map.put(w,1); 
			  }				  
				 
		}
		
		for(Map.Entry<String,Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				 System.out.println(m.getKey()+" "+m.getValue()); 
			}
		}
		
		
		
		
		
	}
	
	
}


class mainClass
{
    public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  duplicate dc=new duplicate();
	  dc.printDuplicate(str);
	  
	}
}