public class LeetCode2469 {
        public static double[] convertTemperature(double celsius) {

            double kelvin = celsius + 273.15;
            double fahrenheit = celsius * 1.8 + 32.0;

            return new double[]{kelvin, fahrenheit};
        }

        public static void main(String[] args) {
            double celsiusTemperature = 36.50;
            double[] convertedTemperatures = convertTemperature(celsiusTemperature);
            System.out.println("Kelvin: " + convertedTemperatures[0] + ", Fahrenheit: " + convertedTemperatures[1]);
            // Output: Kelvin: 309.65, Fahrenheit: 97.7
        }
}