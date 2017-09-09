import java.util.*;
class mainClass
{
   public static void main(String[] args)
   {
     int[] nums={3,5,7,1,100,75,98,65};
	 Arrays.sort(nums);
	 Scanner sc=new Scanner(System.in);
	 int target=sc.nextInt();
     int first=0;
     int last=nums.length-1;
     int midle=0;
	 
		 //System.out.println(midle+" "+first+" "+last);
     while(first<=last)
	 {
		 midle=(first+last)/2;
		 System.out.println(midle+" "+first+" "+last);
	     			 
		 if(nums[midle]==target)
		 {
		    System.out.println(midle+" "+target+"present");
			break;
		 }
		  else if(first==last && target!=nums[first])
		 {
		     System.out.println(midle+" "+first+" "+last+"not present");	 
			 break;
		 }	
		 else if(target>nums[midle])
		 {
		     first=midle+1;
			 
		 }
		 else 
		 {
		    last=midle-1;
		 }
		 
		 //System.out.println(midle+" "+first+" "+last);
	 }
		
	
	 
	 
	 
   }
   
   
}