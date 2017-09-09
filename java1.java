class myClass
{
   public static void main(String args[])
   {
	   A a1=new A();
	   a1.show();
	   
	   A a2=new A(5);
	   a2.show();
	   
	   
      System.out.println("Hello I am back in myClass");
   }
}

class A
{
	int n;
	
	A(int n)
	{
		this.n=n;
	}
	
	A()
	{
		
	}
	
	void show()
	{
		System.out.println("in show "+n);
	}
	  public static void main(String args[])
   {
	    System.out.println("Hello I am back in A class");
   }
	
}