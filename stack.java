import java.util.*;


class mainClass
{
   public static void main(String[] args)
   {
       Stack<Integer> s=new Stack<Integer>();
       int i;
       for(i=0;i<5;i++)
	   {
		   s.push(Integer.valueOf(i));
	   }		   
	   
	   int pop=s.pop();
	   System.out.println(pop);
	   
	   int peek=s.peek();
	   System.out.println(peek);
	   
	   int pos=s.search(2);
	   if(pos==-1)
		   System.out.println("not present");
	   else
		   System.out.println(pos);
   }
}