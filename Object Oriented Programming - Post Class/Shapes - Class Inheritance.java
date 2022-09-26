import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
   double side1;
   double side2;
   double side3;
   double side4;

   public Quadrilateral(double side1, double side2, double side3, double side4) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
       this.side4 = side4;
   }

   protected abstract double getArea();

   protected double getPerimeter() {
       return (side1+side2+side3+side4);
   }
}

// Implement class Parallelogram and methods getArea() and getPerimeter()
class Parallelogram extends Quadrilateral {
    //Write your code here
    double height;
    public Parallelogram(double side1, double side2, double height){
        super(side1,side2,side1,side2);
        this.height = height;
    }
    @Override
    public double getArea(){
        return super.side1 * this.height;
    }
   
}

// Implement class Rhombus and methods getArea() and getPerimeter()
class Rhombus extends Quadrilateral {
    //Write your code here
    double side;
    double height;
    public Rhombus(double side, double height){
        super(side,side,side,side);
        this.side = side;
        this.height = height;
    }
    @Override
    public double getArea(){
        return this.side * this.height;
    }
   
}

//Implement class Rectangle and methods getArea() and getPerimeter()
class Rectangle extends Quadrilateral {
    //Write your code here
    double side;
    double height;
    public Rectangle(double side, double height){
        super(side, height,side,height);
        this.side = side;
        this.height = height;
    }
    @Override
    public double getArea(){
        return this.side * this.height;
    }
  
}
//Implement class Square and methods getArea() and getPerimeter()
class Square extends Quadrilateral {
    //Write your code here
    double side;
    public Square(double side){
        super(side,side,side,side);
        this.side = side;
    }
    @Override
    public double getArea(){
        return this.side * this.side;
    }
   
}



// Do not edit the Main class
class Main {
   public static void main(String[] args) {
       //Write your code here
       Scanner sc = new Scanner(System.in);
       double arr[] = new double[8];
       for(int i=0;i<arr.length;i++){
           double input =sc.nextDouble();
           if(input<0){
               System.out.print("Length of a side cannot be negative. Please Enter a positive integer");
               return;
           }
           arr[i] = input;
       }
       Parallelogram parallelogram = new Parallelogram(arr[0],arr[1],arr[2]);
       System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter() + " and Area of Parallelogram is " + parallelogram.getArea());
       Rhombus rhombus= new Rhombus(arr[3],arr[4]);
       System.out.println("Perimeter of Rhombus is " + rhombus.getPerimeter() + " and Area of Rhombus is "+ rhombus.getArea());
       Rectangle rectangle = new Rectangle(arr[5],arr[6]);
       System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter() + " and Area of Rectangle is " + rectangle.getArea());
       Square square = new Square(arr[7]);
       System.out.println("Perimeter of Square is " + square.getPerimeter() + " and Area of Square is " + square.getArea());

       
       
   }
}
