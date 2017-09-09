class myClass
{
	
	static int a=5;
   public static void main(String args[])
   {
	   A a1=new A(5);
	   a1.show();
	   
	   A a2=new A();
	   a2.show();
	   a2.checkThis();
	 
	   System.out.println("Hello I am back in myClass"+a);
   }
}

class A
{
	 static{System.out.println("static block is invoked");} 
   int n;//output will be 6 and 1.
   //static int n; output will be 6 and 7
	
	
	A()
	{
		 System.out.println("In default constructor\n");
	}
	A(int n)
	{
		this();
		this.n=n;
	}
	
	A(A a)
	{
		this.n=a.n;
	}
	
	 void m()
	{
		 System.out.println("it works\n");
	}
    void checkThis()
	{
		//Both are the same.
		 m();
		 this.m();
	}
   
	void show()
	{
		n++;
		System.out.println("in show "+n);
	}
	
	
	
}