class A
{
   String a="AAAAAA";
   
   A()
   {
	   System.out.println("In A constr");
   }
   
   void method1()
   {
       System.out.println("In A");
   }
   
}
class B extends A
{
  String a="BBBBBB";
  
  B()
  {
	  super();
  }
  
   void method1()
   {
	   
       System.out.println("In B");
	   System.out.println(a+"    "+super.a);
	   super.method1(); 
   }

}
class myClass
{
   public static void main(String[] args)
   {
	   B b=new B();
	   b.method1();
      
   }

}