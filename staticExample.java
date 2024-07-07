package OOPS_By_Apna_College;

class Student8 {
    String name;
    static String school;

    public static void changeSchool () {
        school = "newSchool";
    }
}

public class staticExample {
    public static void main(String[] args) {
        Student8.school = "Jenkins School"; //fix, for static.

        Student8 student1 = new Student8();
        student1.name = "Sayan Banik";

        System.out.print(student1.school);
    }
}
