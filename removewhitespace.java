import java.util.*;
class mainClass
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   str=str.replaceAll("\\s","");
   System.out.println(str);  
 }
}