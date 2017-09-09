class orderingFrequency
{

}
class mainClass
{
  public static void main(String[] args)
  {
     int[] arr=new int[]{2,3,5,3,7,9,5,3,7};
	 int i;
	 LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
	 
	 for(i=0;i<arr.length;i++)
	 {
	   if(map.containsKey(arr[i]))
	   {
	       int value=map.getValue(arr[i]);
		   value++;
		   map.put(arr[i],value);
	   }
	   else
	   {
	     map.put(arr[i],value);
	   }
	 }
	 
  }
}