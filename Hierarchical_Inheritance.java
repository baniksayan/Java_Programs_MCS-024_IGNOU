package OOPS_By_Apna_College;

class Shape3 {
    public void area() {
        System.out.println("Displays Area.");
    }
}

class Triangle3 extends Shape3 {
    public void area(int length, int height) {
        System.out.println((1/2)*length*height);
    }
}

class Circle extends Shape3 {
    public void area(int r) {
        System.out.println(3.142857 * r * r); //PI = 3.142857
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
    }
}
