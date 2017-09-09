import java.lang.*;
import java.util.*;
class mainClass
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
	 double num;
	 char c='1';
	 String str=sc.nextLine();
	 char arr[]=str.toCharArray();
	 num=Double.valueOf(str);
	// System.out.println(Character.getNumericValue(c)+num);
     double finalSum=0.00;
	 for(int i=0;i<arr.length;i++)		 
	 {
		   finalSum=finalSum+Math.pow(Character.getNumericValue(arr[i]),arr.length);
	 }		 
	 System.out.println(finalSum+" "+num);
	 if(finalSum==num)
	 {
		 
		 System.out.println("Yes");
	 }
	 else
	 {
		 System.out.println("No");
	 }
  }
}