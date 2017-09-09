import java.util.*;
class mainClass
{
   public static void main(String[] args)
   {
      int[] nums={-1,0,1,2,-1,-4};
	  Arrays.sort(nums);
	  ArrayList<ArrayList<Integer>> mainlist=new ArrayList<ArrayList<Integer>>();
	  for(int i=0;i<nums.length-2;i++)
	  {
	      if(i==0 || nums[i]>nums[i-1])
		  {
		     int j=i+1;
			 int k=nums.length-1;
			 
			 while(j<k)
			 {
				 if(nums[i]+nums[j]+nums[k]==0)
				 {
					 ArrayList<Integer> al=new ArrayList<Integer>();
					 al.add(nums[i]);
					 al.add(nums[j]);
					 al.add(nums[k]);
					 
					 mainlist.add(al);
					 j++;
					 k--;
                     while(j<k && nums[j]==nums[j-1])
                        j++;
                    while(j<k && nums[k]==nums[k+1])
                        k--;
 
          					 
				 }
				 else if(nums[i]+nums[j]+nums[k]<0)
				 {
					 j++;
				 }
				 else
				 {
					 k--;
				 }
			 }
			 
		  }
	  }
	  
	  for(int i=0;i<mainlist.size();i++)
	  {
		   ArrayList<Integer> temp=mainlist.get(i);
		   for(int k=0;k<temp.size();k++)
		   {
			   System.out.print(temp.get(k));
		   }
		   System.out.println("\n");
	  }
   }
}