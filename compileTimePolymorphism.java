package OOPS_By_Apna_College;
class Student5 {
    String name;
    int age;

    public void printInfo(String name) { //Polymorphism
        System.out.println(name);
    }

    public void printInfo(int age) { //Polymorphism
        System.out.println(age);
    }
//functionOverloading
    public void printInfo(String name, int age) { //Polymorphism
        System.out.println(name + " " + age);
    }
}
public class compileTimePolymorphism {
    public static void main(String[] args) {
        Student5 s1 = new Student5();

        s1.name = "SayanBanik";
        s1.age = 20;

        s1.printInfo(s1.name, s1.age);
    }
}
