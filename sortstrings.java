import java.util.*;	
class sortStrings
{
  void sort(String[] str)
  {
	  int i=0;
	  for(i=1;i<str.length;i++)
	  {
		  int j=i-1;
		  String temp=str[i]; 
		  //System.out.println(str.length+" "+str[i].length());
		  
		  while(j>=0 && temp.length() < str[j].length())
		  {
			  str[j+1]=str[j];
			  j--;
		  }
		  str[j+1]=temp;
		  
	  }
	  
	  for(i=0;i<str.length;i++)
	  {
		  System.out.println(str[i]);
	  }
	  
  }

}
class mainClass
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  String[] str=new String[5];
      int i=0;
	  str[i]=sc.nextLine();
	  
	  while(str[i].length()!=0)
	  {
		i++;
		str[i]=sc.nextLine();
		
	  }
	   sortStrings s=new sortStrings();
	   s.sort(str);
      	  
  }
}