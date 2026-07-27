// 7. To Understand concept of abstract class. 
// 1. The abstract Vegetable class has three 
// subclasses named Potato, Brinjal and 
// Tomato. Write an application that 
// demonstrates how to establish this class 
// hierarchy. Declare one instance variable 
// of type String that indicates the color of a 
// vegetable. Create and display instances of 
// these objects. Override the toString() 
// method of Object to return a string with 
// the name of the vegetable and its color.
public abstract class practical_7_1 {
    String color;

    public abstract String toString();

    public static void main(String a[]) {

        practical_7_1 v = new Potato();
        System.out.println(v.toString());

        practical_7_1 v1 = new Brinjal();
        System.out.println(v1.toString());

        practical_7_1 v2 = new Tomato();
        System.out.println(v2.toString());
    }
}

class Potato extends practical_7_1 {

    Potato() {
        color = "White";
    }

    public String toString() {
        return ("Color of Potato: " + this.color);
    }
}

class Brinjal extends practical_7_1 {

    Brinjal() {
        color = "Dark Purple";
    }

    public String toString() {
        return ("Color of Brinjal: " + this.color);
    }
}

class Tomato extends practical_7_1 {

    Tomato() {
        color = "Red";
    }

    public String toString() {
        return ("Color of Tomato: " + this.color);
    }
}
// Color of Potato: White
// Color of Brinjal: Dark Purple
// Color of Tomato: Red