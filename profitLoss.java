import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double cp = scanner.nextInt();

        System.out.print("Enter the selling price: ");
        double sp = scanner.nextInt();

        if (sp > cp) {
            System.out.println("Profit is made.");
            System.out.println("Profit amount: " + (sp-cp));

        } if (cp > sp) {
            System.out.println("Loss is incurred.");
            System.out.println("Loss amount: " + (cp-sp));

        } if (sp == cp) {
            System.out.println("No profit, No loss");
        }
    }
}
