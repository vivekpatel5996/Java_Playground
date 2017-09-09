class mainClass
{
   public static void main(String[] args)
   {
      int[][] mat1=new int[][]{{7,6,1},{2,3,8}};
	  int[][] mat2=new int[][]{{4,9},{1,7},{3,8}};
	  
	  int[][] ans=new int[mat1.length][mat2[0].length];
	  
	  for(int i=0;i<mat1.length;i++)
	  {
	     for(int j=0;j<mat2[i].length;j++)
		 {
		    for(int k=0;k<mat2.length;k++)
			{
			   ans[i][j]=ans[i][j]+(mat1[i][k]*mat2[k][j]);
			}
			System.out.print(" "+ans[i][j]+" ");
		 }
		 System.out.println("\n");
	  }
	  
   }
}