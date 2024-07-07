package OOPS_By_Apna_College;
class Student4 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.print(this.age);
    }

    Student4(Student4 newStudent) { //Copy Constructor
        this.name = newStudent.name;
        this.age = newStudent.age;
    }

    Student4() {
    }
}
public class copyConstructor {
    public static void main(String[] args) {
        Student4 s1 = new Student4();

        s1.name = "SayanBanik";
        s1.age = 20;

        Student4 s2 = new Student4(s1);
        s2.printInfo();
    }
}
