public class Circle{
    private double radius;

    public void setRad(double radius){
        this.radius=radius;
    }
      public double getRad(){
        return radius;
    }
    public static void main(String[] args) {
        Circle circleObj=new Circle();
        circleObj.setRad(5.0);
        double rad= circleObj.getRad();
        double area = 3.14 * rad * rad;
        double circumference = 2 * 3.14 * rad;
        System.out.println("Radius: " + rad);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}