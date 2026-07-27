// Create an abstract class ‘Shape’ with two 
// members base and height , a member 
// function for initialization and a pure 
//  virtual function to compute area(). Derive 
// two specific classes ‘Triangle’ and 
// ‘Rectangle’ which override the function 
// area(). Use these classes in main function 
// and display the areaof triangle and 
// rectangle
abstract class shape {
    int base, height;
    double a;

    void initFun() {
        base = 5;
        height = 8;
    }

    abstract void compute_area();
}

class triangle extends shape {
    public void compute_area() {
        a = (base * height) / 2.0;
        System.out.println("\nArea of Triangle is " + a);
    }
}

class rectangle extends shape {
    public void compute_area() {
        a = (base * height);
        System.out.println("\nArea of Rectangle is " + a);
    }
}

public class practical_7_2 {
    public static void main(String[] args) {

        triangle obj1 = new triangle();
        obj1.initFun();
        obj1.compute_area();

        rectangle obj2 = new rectangle();
        obj2.initFun();
        obj2.compute_area();
    }
}
// Area of Triangle is 20.0

// Area of Rectangle is 40.0