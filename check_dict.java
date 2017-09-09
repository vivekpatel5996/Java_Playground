import java.util.*;
class mainClass
{
  public static void main(String[] args)
  {
      String str="leetkcode";
	  String[] dict={"leet","code"};
	  ArrayList<String> al=new rrayList<String>(Arrays.asList(dict));

	   int start=0,end=0,flag=0;
       while(start!=str.length())
       {
	       flag=0;
           for(end=start+1;end<str.length();end++)
		   {
		     String word=str.substring(start,end+1);
			 System.out.println(word);
		     if(al.contains(word))
			 {
			   System.out.println("flag set");
			   flag=1;
			   break;    
			 }
			 
		   }
		   start=end+1;
		   if(flag==0)
		      break;
		   
       }	  
	   
	   if(flag==1)
	   {
	      System.out.println("possible");
	   }
	   else
	   {
	        System.out.println("not possible");
	   }
  }
	  
}