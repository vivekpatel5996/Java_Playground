class Adder
{
    static int  Add(int a,int b)
	{
	   return a+b;
	}
    static double  Add(int a,double b)
	{
	   return a+b;
	} 

    static int  Add(int a,int b,int c)
	{
	   return a+b+c;
	} 	
}

class myClass
{
	public static void main(String args[])
   {
	   System.out.println(Adder.Add(1,1.2));
	   System.out.println(Adder.Add(1,2,3));
   }
}