import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      int length1,length2;
      length1=sc.nextInt();
      length2=sc.nextInt();
      String first;
	  first=sc.nextLine();
      System.out.println("asdas");
      String second;
	  second=sc.nextLine();
      
      String[] words=first.split("\\s");
      HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
        
      int flag=0;
      for(String w:words)
      {
            if(hashmap.containsKey(w))
            {  
                int value=hashmap.get(w);
                value++;
                hashmap.put(w,value);
            }
            else
            { 
                hashmap.put(w,1);
            }
            
      }
        
      for(Map.Entry m:hashmap.entrySet())
          System.out.println(m.getKey()+" "+m.getValue());
        
      String[] words1=second.split("\\s");
      for(String w:words1)
      {
            if(hashmap.containsKey(w))
            {
              int value=hashmap.get(w);
              
              value--;
              if(value<0)
              {
                  hashmap.remove(w);
              }
              else
              {
                  hashmap.put(w,value);
              }
            }
            else
            {
                flag=1;
                break;
            }
      }  
      if(flag==0)
         System.out.println("Yes");
      else
         System.out.println("No");
        
           
    }
}
