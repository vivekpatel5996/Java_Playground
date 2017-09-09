import java.util.*;
class mainClass
{
   public static void main(String[] args)
   {
    
	Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    
    HashMap<Character,Integer> map=new HashMap<Character,Integer>();

    for(int i=0;i<str.length();i++)	
	{
        if(map.containsKey(str.charAt(i)))		
		{
			int value=map.get(str.charAt(i));
			value++;
			map.put(str.charAt(i),value);
			value=0;
		}			
		else
		{
			map.put(str.charAt(i),1);
		}
	}		
	
	for(Map.Entry<Character,Integer> m:map.entrySet())
	{
		 System.out.println(m.getKey()+" "+m.getValue());
	}
     	
     
   }

}
