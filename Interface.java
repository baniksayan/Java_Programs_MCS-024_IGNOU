package OOPS_By_Apna_College;
interface Animal2{
    public void walk2();
}

interface Herbivore {

}

class Horse2 implements Animal2, Herbivore {
    public void walk2() {
        System.out.println("Walks on 4 legs.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse2 horse2 = new Horse2();
        horse2.walk2();
    }
}
