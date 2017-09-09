

class mainClass
{
   public static void main(String[] args)
   {
   
    String[] words = new String[]{"ptolemaic","retrograde","supplant","undulate","xenoepist","asymptote","babka","banoffee","engender","karpatka","othellolagkage"};
   
     for(int i=0;i<words.length-1;i++)
     { 
	    if(words[i].compareTo(words[i+1])>0)
		{
		   System.out.println(i+1);
		   break;
		}
     }	 
	 
   }
}