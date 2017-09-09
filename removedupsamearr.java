class mainClass
{
   public static void main(String[] args)
   {
     int[] arr=new int[]{1,1,2,2,2,3,4,4,5,5,6};
	 int count=0;
	 for(int i=0;i<arr.length-1;i++)
	 {
		 if(arr[i]==arr[i+1])
		 {
			 count++;
	     }
		 else
		 {
			arr[i-count+1]=arr[i+1];
	     }
	 }
	 
	 for(int k=0;k<arr.length-count;k++)
	 {
		 System.out.println(arr[k]);
	 }
	 
   }   
}