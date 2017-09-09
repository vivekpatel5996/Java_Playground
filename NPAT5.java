import java.util.*;
class conseSum
{
    int returnSum(int a[],int len,int m)
	{
	    int i=0;
		int sum=0;
		int max=0;
		for(i=0;i<m;i++)
		{
	      sum+=a[i];		
		}
		max=sum;
		for(i=m;i<len;i++)
		{
			sum+=a[i];
			sum-=a[i-m];
			if(sum>max)
				max=sum;
		}
		
	    return max;
	}
	
	

}


class mainClass
{
	public static void main(String[] args)
	{
		System.out.println("Enter m and len");
		int m,len;
		Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        len=sc.nextInt();		
		System.out.println("Enter array elements");
		int a[]=new int[len];
		for(int k=0;k<len;k++)
	    {
		   a[k]=sc.nextInt();
		}
		conseSum cs=new conseSum();
		int max=cs.returnSum(a,len,m);
		System.out.println("maximum sum is"+max);
	}
}