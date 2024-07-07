package OOPS_By_Apna_College;
class Shape2 {
    public void area() {
        System.out.println("Displays Area.");
    }
}

//single inheritance example open
//multi-level inheritance example open
class Triangle2 extends Shape2 {
    public void area(int length, int height) {
        System.out.println((1/2)*length*height);
    }
} //single inheritance example close

class EquilateralTriangle extends Triangle2 {
    public void area(int length, int height) {
        System.out.println((1/2)*length*height);
    }
} //multi-level inheritance example close

public class singleInheritance {
    public static void main(String[] args) {
    }
}
