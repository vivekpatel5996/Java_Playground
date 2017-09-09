import java.util.*;
class reversePolish
{


}

class mainClass
{
   public static void main(String[] args)
   {
     String str="21+3*";
	 char[] arr=str.toCharArray();
	 Stack<Integer> st=new Stack<Integer>();
	 for(int i=0;i<arr.length;i++)
	 {
	     if(Character.isDigit(arr[i]))
		 {
		     st.push(Integer.valueOf(arr[i])-48);
			 //System.out.println(Integer.valueOf(arr[i])-48);
		 }
		 else
		 {
		    int a=st.pop();
			int b=st.pop();
			System.out.println(a+" "+b);
			int res=0;
			if(arr[i]=='+')
			{
			    res=a+b;
			   st.push(res);
			}
			else if(arr[i]=='-')
			{
			  res=a-b;
			   st.push(res);
	
			}
			else if(arr[i]=='*')
			{
			 res=a*b;
			   st.push(res);
	
			}
			else
			{
	     		res=a/b;
			   st.push(res);
	
			}
			
		 }
	 }
	 
	 System.out.println(st.pop());
   }
}	