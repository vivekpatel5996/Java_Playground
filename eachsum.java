class sum
{
   void findInteger(int[] arr)
   {
	   int i=0,j=0,temp=0;
	   int num=1;
	   int flag=0;
	   while(true)
	   {
		   System.out.println("iiiiii"+i);
		   if(i<=(arr.length-1) && num==arr[i])
		   {
			   num++;
			   i++;
			   continue;
		   }
		   else
		   {
			   temp=num;
			   for(j=i-1;j>=0;j--)
			   {
				   
				   if(temp-arr[j]<0)
				   {
					   continue;
				   }
				   else
				   {
					   temp=temp-arr[j];
					   System.out.println(num+" "+j+" "+temp);
					   if(temp==0)
					       break;
				   }   
			   }
			   System.out.println("out of"+num+" "+j+" "+temp);
			   if(temp!=0)
			   {
				   System.out.println("This postivie integer is  not possible :"+num);
				   flag=1;
			   }
			   num++;
			   
		   }
		  
		    if(i<=(arr.length-1)&& num>arr[i])
				i++;
             
		    if(flag==1)
                break;				
	   }		   
	   
   }
}

class mainClass
{
  public static void main(String[] args)
  {
     int[] arr=new int[]{1,2,3,10,11};
	 sum s=new sum();
	 s.findInteger(arr);
  }
}