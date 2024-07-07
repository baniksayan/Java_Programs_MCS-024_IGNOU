package OOPS_By_Apna_College;
class Pen {
    String color;
    String type; // ballpoint; gel

    public void write() {
        System.out.println("Writing something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}
public class firstProgram {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "BallPoint";

        pen1.printColor();
        pen2.printColor();
    }
}
