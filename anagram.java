import java.util.*;

class Anagaram
{
   boolean isAnagram(String s1,String s2)
   {
	  char f[]=s1.toCharArray();
	  char s[]=s2.toCharArray();
	  
	  Arrays.sort(f);
	  Arrays.sort(s);
	  String first,second;
	  first=String.valueOf(f);
	  second=String.valueOf(s);
	  
	   if(first.equals(second))
	   {
		    return true;
	   }
	   else
	   {
		   return false;
	   }
	   
   }

}


class mainClass
{ 
   public static void main(String[] args)
   { 
      String first,second;
	  Scanner sc=new Scanner(System.in);
	  first=sc.nextLine();
	  second=sc.nextLine();
	  
	  Anagaram a=new Anagaram();
	  if(a.isAnagram(first,second))
	  {
		System.out.println("Yes");
		  
	  }
	  else
	  {
		System.out.println("No");  
	  }
	
	  
	  
   }
}