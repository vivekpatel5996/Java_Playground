import java.util.*;
class mainClass
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;
	   while(n/10!=0)
	   {
	       sum=sum+(n%10);
		   n=n/10;
	   }
	   sum=sum+n;
	   System.out.println(sum);
	   
   }
}