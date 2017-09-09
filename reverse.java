import java.util.*;
class mainClass
{
  static String ans="";
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  
	  System.out.println("recursively "+recursiveReverse(str));
	  
	  System.out.println("iteratively "+iterativeReverse(str));
  }
  
  
  static String recursiveReverse(String str)
  {
	  if(str.length()<2)
	  {
		  return str;
	  }
	  
	  return recursiveReverse(str.substring(1))+str.charAt(0);  
  }
  
  static String iterativeReverse(String str)
  {
	   String ans="";
	   char a[]=str.toCharArray();
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   ans=ans+str.charAt(i);
	   }
	   return ans;
  }
}