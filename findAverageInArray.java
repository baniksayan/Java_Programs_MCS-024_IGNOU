package HW_26_January;

public class findAverageInArray {
    public static void main(String[] args) {
        int arr[] = {1,70,80,56,45,99,88,20,91,37,73,894,658,487,512,125,123,65,452,84};

        int sum = 0;

        int n = arr.length;
        for (int i=0; i<n; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum/n; //typecast of SUM from int to double

        System.out.println("The average of elements in the array is: "+avg);
    }
}


