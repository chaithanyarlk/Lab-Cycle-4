abstract class Shape{
     public int x,y;
     abstract double Area();
}

class Rectangle extends Shape{
     public Rectangle(int x,int y){
          this.x=x;
          this.y=y;
     }
     public double Area(){
          return (x*y);
     }
}
class Triangle extends Shape{
     public Triangle(int x,int y){
          this.x=x;
          this.y=y;
     }
     public double Area(){
          return((x*y)/2);
     }
}
class Circle extends Shape{
     public Circle(int x){
          this.x=x;
          
     }
     public double Area()
     {
          return ((1.5707963267948*(x*x)));
     }
}

public class Areal{
     public static void main(String[]args){
          Rectangle r= new Rectangle(4, 5);
          System.out.println(r.Area());
          Triangle t= new Triangle(4,5);
          System.out.println(t.Area());
          Circle c= new Circle(5);
          System.out.println(c.Area());

     }
     

     

}