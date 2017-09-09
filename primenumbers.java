import java.util.*;
class primeNumbers
{
	//mark[i]=0 prime or mark[i]=1 not prime
    	
    public void printNumbers(int n)
	{
		int[] mark=new int[n+1];
		for(int i=2;i*i<=n;i++)
		{
	        if(mark[i]==0)
			{
				for(int j=i*2;j<=n;j=j+i)
				{
					mark[j]=1;
				}
			}
		}
		
		for(int i=2;i<=n;i++)
		{
			if(mark[i]==0)
				System.out.println(i);
		}
	}
}

class mainClass
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    primeNumbers pn=new primeNumbers();
	pn.printNumbers(n);
	
  }
}