import java.util.*;
class replaceSpace
{
    void doIt(String str)
	{
		int index=0;
		String resultstr="";
		while(str.indexOf(" ")!=-1)
		{
			index=str.indexOf(" ");
			resultstr=resultstr+str.substring(0,index)+"%20";
			index++;
			str=str.substring(index);
		}
		
		System.out.println(resultstr+str);
		
	}
	
}

class mainClass
{
   public static void main(String[] args)
   {
	  Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
	  replaceSpace rs=new replaceSpace();
	  rs.doIt(str);
   }
}