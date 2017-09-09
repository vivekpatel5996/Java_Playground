import java.util.*;

class mean
{
   public static void main(String[] args)
   {
        int count,sum,num=0;
	    count=0;
	    sum=0;
       	
		Scanner sc=new Scanner(System.in);
			
        while(sc.hasNextInt())
        {
		   num=sc.nextInt();
		   sum+=num;
		   count++;
        }		
		
		float mean=sum/count;
		System.out.println(mean);
      
   }
}