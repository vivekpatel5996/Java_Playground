import java.util.*;
class mostFrequent
{
    public void getMostFreq(int a[])
	{
	    int arr[][]=new int[a.length][2];
        
        Arrays.sort(a);
		int count=1,i,j=0,k=0;
		for(i=1;i<a.length;i++)
		{
			
		    if(a[i]==a[i-1])
			{
				count++;
				if(i==a.length-1)
				{
				  arr[j][k]=a[i-1];
				  arr[j][k+1]=count;
				}
            }
			else
			{
				arr[j][k]=a[i-1];
				arr[j][k+1]=count;
				j++;
				k=0;
				count=1;
				if(i==a.length-1)
				{
				  arr[j][k]=a[i];
				  arr[j][k+1]=1;
				}
				
			}
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<2;j++)
			{
				
				System.out.print(arr[i][j]);
			}
			System.out.println("\n");
		}
		
		
   
		
		
	}

}

class mainClass
{
  public static void main(String[] args)
  {
     int[] arr=new int[]{1,2,1,2,3,2,4,4,3,4,4,5,6,9};
	 mostFrequent  mf=new mostFrequent();
	 mf.getMostFreq(arr);
  }
}