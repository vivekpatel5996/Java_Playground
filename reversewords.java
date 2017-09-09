import java.util.*;
class reverseWords
{
    void doIt(String str)
	{
		int i=str.length()-1;
		String word="",resultstring="";
		int index=0;
		int start=0,end=str.length()-1;
	    while(i>=0)
		{
			System.out.println(i);
			word="";
		 while(str.charAt(i)!=' ')
		 {
	 	     	word=String.valueOf(str.charAt(i))+word;
				i--;
				if(i==-1)
					break;
		 }
		 i--;
		 
		 resultstring=resultstring+" "+word;
		 if(i<0)
			 break;
		
		}
		 System.out.println(resultstring);  
	}

}

class mainClass
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   String sentence=sc.nextLine();N
   reverseWords rw=new reverseWords();
   rw.doIt(sentence);
 }
}