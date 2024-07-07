public class simpleInterest {
    public static void main(String[] args) {
        double principle = 2000;
        double rate = 3.75;
        double time = 3.5;

        double simpleInterest = (principle * rate * time) / 100;
        System.out.println(simpleInterest);
    }
}
