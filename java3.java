class Figure
{
   void inFigure()
   {
	   System.out.println("In figure");
   }   
   int side=3;
}

class Square extends Figure
{
	void inSquare()
	{
		System.out.println("In Square");
	}
}

class Square2 extends Square
{
   public static void main(String args[])
   {
       Square2 s=new Square2();
	   System.out.println(s.side);
	   s.inFigure();
	   s.inSquare();
   }
}


