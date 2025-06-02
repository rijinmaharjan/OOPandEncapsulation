class Shape{
int length;
int breadth;
int radius;
Shape(int length, int breadth){
this. length = length;
this.breadth = breadth;
}

Shape(int radius){
this. radius = radius;

}
    }
        
class Rectangle extends Shape{
Rectangle(int length, int breadth) {
super(length, breadth);
}
void calculatePerimeter(){
    int peri = 2*(length + breadth);
    System.out.println("Rectangle Area: " + peri);

}
}


class Circle extends Shape{
Circle(int radius){
super(radius);
}

void calculateCircumference(){
        double circumference = Math.PI * 2 * radius;
        System.out.println("Circle Area: " + circumference);
    
    }
}


public class Perimeter{
    public static void main(String[] args) {
   Rectangle rect = new Rectangle(5, 4);
        rect.calculatePerimeter();
        Circle circ = new Circle(3);
        circ.calculateCircumference();  
    }
    }


