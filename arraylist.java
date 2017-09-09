import java.util.*;
import java.io.*;

class Person
{
     String name;
	 float height;
	 String surname;
	 
	 Person(String name,float height,String surname)
	 {
	    this.name=name;
		this.height=height;
		this.surname=surname;
	 }
	 
	 
}


class mainClass
{
    public static void main(String[] args)
	{
	    Person p1=new Person("vivek",162,"patel");
        Person p2=new Person("sagar",168,"patel");
        Person p3=new Person("Nikhil",168,"patel");
		
		ArrayList<Person> al=new ArrayList<Person>();
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		//al.remove(0);
		
		
		System.out.println(index);
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{	
	       Person p=(Person)itr.next();
		   System.out.println(p.name);
		   
		}
	}
 
}