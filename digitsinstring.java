import java.util.*;
import java.util.regex.*;
class mainClass
{
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
	   Pattern p=Pattern.compile("[0-9]+");
	   
	   Matcher m=p.matcher(str);
	   
	   if(m.matches())
		   System.out.println("yes");
	   else
		   System.out.println("no");
		   
    
   }
}