import java.util.*;
class mainClass
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=0,j=0,k=0;

    for(i=0;i<n;i++)
	{
		 for(j=i;j<n-1;j++)
		 {
			 System.out.print(" ");
		 }
		 for(k=0;k<=i;k++)
		 {
			 System.out.print((k+1));
		 }
		 
		 for(k=0;k<i;k++)
		 {
			 System.out.print((k+1));
		 }
		 System.out.println("\n");
    }		
	
  }
}