import java.util.*;
class mainClass
{
   public static void main(String[] args)
   {
       int[] arr=new int[]{10,10,2,2};
	   int firstMax=arr[0];
	   int secondMax=0;
	   for(int i=1;i<arr.length;i++)
	   {
	      if(arr[i]>firstMax)
		  {
		    secondMax=firstMax;
		    firstMax=arr[i];
			System.out.println(firstMax+" F "+secondMax);
	      }
		  else if(arr[i]>secondMax && arr[i]<firstMax)
		  {
		     secondMax=arr[i];
		     System.out.println(firstMax+" S "+secondMax);
		  }
		   //System.out.println(firstMax+" "+secondMax);
	   }
	   
	   //System.out.println(firstMax+" "+secondMax);
   }
}