class mainClass
{
    public static void main(String[] args)
	{
	    int arr[]={1,2,3,3,2,1};
		removeDup ed=new removeDup();
		int my[]=ed.remove(arr);
	}
}

class removeDup
{
    int[] remove(int a[])
	{
		
	  int i,count=0,k=0;
	  int result[]=new int[a.length];
	  int temp[]=new int[1000];
	  for(i=0;i<a.length;i++)
	  {
		  if(temp[a[i]]!=1)
		  {
			  result[k]=a[i];
			  temp[a[i]]=1;
			  k++;
		  }
		  else
		  {
			  count++;
		  }
			  
		  
	  }
	  
	  
	  for(i=0;i<(result.length-count);i++)
	  {
		 
		System.out.println(result[i]);  
		  
	  }
	  
	  return result;
	}
}