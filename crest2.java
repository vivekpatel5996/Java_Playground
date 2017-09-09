class mainClass
{
   public static void main(String[] args)
   {
       P.p(8);      
   }
}

 class P
{
	static void p(int n)
	{
		int i,j=0,add=0,k;
        if(n%2==0)
		{
			for(i=0;i<(n/2);i++)
			{
				for(j=add+1;j<=add+n;j++)
				{
				System.out.print(" "+j+" "); 
				}
				add=j-1+n;	
		   
		        System.out.println("\n");  		
			}
		    add=j;
			for(i=0;i<(n/2);i++)
			{
				for(k=j;k<=add+n-1;k++)
				{
					System.out.print(" "+k+" "); 
				}
			    add=k-2*n-n;
				j=add;
				System.out.println("\n");
			}
		}
		else
		{
			for(i=0;i<=(n/2);i++)
			{
				for(j=add+1;j<=add+n;j++)
				{
				System.out.print(" "+j+" "); 
				}
				add=j-1+n;	
		   
		      System.out.println("\n");  		
			}
			
			
			j=j-2*n;
			add=j;
			for(i=0;i<(n/2);i++)
			{
				for(k=j;k<=add+n-1;k++)
				{
				System.out.print(" "+k+" ");
				}
				add=k-2*n-n;
				j=add;
				System.out.println("\n");
			}
		}

		
        	  		
	}
}

