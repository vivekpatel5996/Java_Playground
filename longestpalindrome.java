import java.util.*;
class longestPal
{
	void find(String str)
	{
		int length=str.length();
		boolean[][] table=new boolean[length][length];
        
		int i=0,j=0;
		int startindex=0;
		int maxlen=1;
		//for unit length
		for(i=0;i<length;i++)
		{
		   table[i][i]=true;	  
		}
		
		for(i=0;i<length-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				table[i][i+1]=true;
				startindex=i;
				maxlen=2;
				System.out.println(startindex+" "+maxlen);
			}
		}
           		
		for(int len=3;len<=length;len++)
		{
			for(i=0;i<length-len+1;i++)
			{
				j=i+len-1;
				if(table[i+1][j-1]==true && str.charAt(i)==str.charAt(j))
				{
					table[i][j]=true;
					startindex=i;
					maxlen=len;
					System.out.println(startindex+" "+maxlen);
				}
			}
		}
        String rs=str.substring(startindex,startindex+maxlen);
        System.out.println(rs);		
	}
}

class mainClass
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
	 String str=sc.nextLine();
	 longestPal lp=new longestPal();
	 lp.find(str);
  }
}