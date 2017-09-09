import java.util.*;
class mainClass
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 int flag=0;
	 LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	 
	 int value=0;
	 for(int i=0;i<s.length();i++)
	 {
	     if(map.containsKey(s.charAt(i)))
		 {
			 value=map.get(s.charAt(i));
			 value++;
			 map.put(s.charAt(i),value);
			 value=0;
		 }
		else
		{
			 map.put(s.charAt(i),1);
		}
	
	 }
	 
	 for(Map.Entry<Character,Integer> m:map.entrySet())
	 {
		 if(m.getValue()==1)
		 {
			 System.out.println(m.getKey());
			 flag=1;
			 break;
		 }
	 }
	 if(flag==0)
		 System.out.println("Not Found");
	 
  }
}