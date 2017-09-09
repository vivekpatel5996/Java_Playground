import java.util.*;
class mainClass
{
  public static void main(String[] args)
  {
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	  map.put(1,1);
	  map.put(2,2);
	  map.put(3,3);
	  map.put(4,4);
	  map.put(5,5);
	  map.remove(2);
	  
	  for(Map.Entry<Integer,Integer> m:map.entrySet())
	  {
	     System.out.println(m.getKey());
	  }
	  
	  for(Iterator<Map.Entry<Integer,Integer>> it=map.entrySet().iterator();it.hasNext();)
	  {
		Map.Entry<Integer,Integer> entry=it.next();
        if(entry.getKey()>4)
		{
			it.remove();
		}			
	  }
	  
	   for(Map.Entry<Integer,Integer> m:map.entrySet())
	  {
	     System.out.println("  "+m.getKey());
	  }
  }
}