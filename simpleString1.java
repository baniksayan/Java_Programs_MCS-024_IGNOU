package normalUsageJavaPrograms;
import java.util.Scanner;
public class simpleString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Sayan";
        int l = name.length();
        String name2 = "Banik";
        String fullName = name+ " "+ name2;
        String subString = fullName.substring(2,11);
        String upperCase = fullName.toUpperCase();
        String lowerCase = fullName.toLowerCase();


        System.out.println("Original String is: "+name);
        System.out.println("Entered String's Length is: "+l);
        System.out.println("Concatenated String is: "+fullName);
        System.out.println("Concatenated String's Substring is: "+subString);
        System.out.println("Concatenated String's UpperCase String is:"+upperCase);
        System.out.println("Concatenated String's LowerCase String is:"+lowerCase);
    }
}
