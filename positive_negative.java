import java.util.*;
import java.util.Arrays.*;
class mainClass
{
   public static void main(String[] args)
   {
      int[] numbers=new int[]{1,2,3,-4,-1,-2};
	  int[] result=new int[6];
	  int i=0,positive=0,negative=0;
	  
	  ArrayList<Integer> pos=new  ArrayList<Integer>();
	  ArrayList<Integer> neg=new  ArrayList<Integer>();
	  
	  for(i=0;i<numbers.length;i++)
	  {
		  if(numbers[i]>0)
		  {
			  pos.add(numbers[i]);
		  }
		  else
		  {
			  neg.add(numbers[i]);
		  }
	  }
	  
	  
	  for(i=0;i<numbers.length;i++)
	  {
		  if(i%2==0 && negative<neg.size())
		  {
			  result[i]=neg.get(negative);
			  negative++;
		  }
		  else if(i%2!=0 && positive<pos.size())
		  {
			  result[i]=pos.get(positive);
			  positive++;
		  }
          else if(pos.size()>neg.size())
		  {
			  
			  result[i]=pos.get(positive);
			  positive++;
			  
		  }
          else
		  {
			  
			  result[i]=neg.get(negative);
			  negative++;
			  
		  }  
	  }
	  /*Arrays.sort(numbers);
	  
	  while(numbers[i]<0)
	  {
		  result[negative]=numbers[i];
		  negative++;
		  negative++;
		  i++;
	  }
	  negative=negative-2;
	  
	  while(positive<numbers.length && i<numbers.length)
	  {
		 if(positive>negative)
		 {			 
   		   result[positive]=numbers[i];
		   positive++;
		   i++;
		   continue;
	     } 	 
		 else
		 {
			 result[positive]=numbers[i];
			 positive++;
			 positive++;
			 i++;
		 }	 
	  }
	  
	  */for(i=0;i<result.length;i++)
	  System.out.println(result[i]);
	  
   }
}