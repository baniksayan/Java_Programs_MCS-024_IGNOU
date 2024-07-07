import java.util.Scanner;
public class youngestAmongThree {
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

           System.out.print("Enter the age of Ram: ");
           int ramAge = input.nextInt();

           System.out.print("Enter the age of Shyam: ");
           int shyamAge = input.nextInt();

           System.out.print("Enter the age of Ajay: ");
           int ajayAge = input.nextInt();

           int youngestAge = ramAge;

           if (shyamAge < youngestAge) {
               youngestAge = shyamAge;
           } if (ajayAge < youngestAge) {
               youngestAge = ajayAge;
           }

           System.out.println("The youngest age is " +youngestAge+ ".");
       }
}
