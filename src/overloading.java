class Shape{
    public void calculateArea(){
        System.out.println("Method is used for calculating area...");
    }
    public void calculateArea(int r){
        System.out.println("Area of the circle is:" +(3.14*r*r));
    }
    public void calculateArea(double val1 , double val2){
        System.out.println("Area of triangle is:" +(0.5*val1*val2));
    }
    public void calculateArea(int a , int b){

        System.out.println("Area of rectangle is:"+(a*b));
    }
}
public class overloading {
    public static void main(String[] args){
       Shape myshape = new Shape();
       myshape.calculateArea(4);
       myshape.calculateArea(2,2);
       myshape.calculateArea(1.2, 4.8);
       myshape.calculateArea();

    }
}
