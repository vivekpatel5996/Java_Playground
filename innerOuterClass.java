class outerClass
{
	static String msg="Hello static member";
	String msg1="I am not static.";
   public class innerClass
   {
      void printMsg()
	  {
		  System.out.println("Inside printMsg "+msg);
 		  System.out.println("Inside printMsg "+msg1);
	  }
   
   }
   
   public static class nestedClass
   {
      void display()
	  {
		  System.out.println("Inside display "+msg);
		  
		  //It will throw error.
		  //System.out.println("Inside display "+msg1);
	  }
	  
   }

}

class mainClass
{
   public static void main(String[] args)
   {
	   //for  nested static class we don't have to create outer Class reference.
        outerClass.nestedClass nc=new outerClass.nestedClass();
		nc.display();
		
		 //If display() is static method.
		//outerClass.nestedClass.display();
	    
		//inner class means non static nested Class.
		//for non static class we must have to create outer class reference.
		outerClass oc=new outerClass();
		outerClass.innerClass in=oc.new innerClass();
		in.printMsg();
   }
}