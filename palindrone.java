import java.util.*;
class Palindrome
{
  boolean isPalindrone(String str)
  {
	  int end=str.length()-1;
	  int start=0;
	  
	  while(start<=end)
	  {
		  if(str.charAt(start)==str.charAt(end))
		  {
			  start++;
			  end--;
			  continue;
		  }
		  else
		  {
			  return false;
			  
		  }
			  
	  }
	 
		  return true;
	  
  }
  
}

class mainClass
{
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in); 
	   Palindrome p=new Palindrome();
	   String str=sc.nextLine();
	   System.out.println(p.isPalindrone(str));
	   
	   
   }
}