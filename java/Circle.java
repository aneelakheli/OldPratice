class Circle
{
double r;
  // this is default constructor
   public Circle()
    {
  	this.r=1.0;
    }
//this is parameterized construct
    public Circle(double r)
    {
    this.r=r;
     }
    //parameterized constructor with object as param but sometime also known as copy constructor
      public Circle(Circle circle)
	{
	 this.r = circle.radius;
	}


    public double calculateArea()
     {
     return 3.14*r*r; 
     }

}
class CircleDemo
{
   public static void main(String[] args)
    {
     Circle c1 = new Circle(); 
     System.out.println("area of circle is "+c1.calculateArea());
     Circle c2 = new Circle(2);
     System.out.println("area of circle is "+c2.calculateArea());
	
     }

}
