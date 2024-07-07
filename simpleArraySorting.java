package HW_26_January;
public class simpleArraySorting {
    public static void main(String[] args) {
        int[] arr = {10,8,7,4,1,3,9};
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        //bubble sort...
        for (int i=0; i<(n-1); i++) {
            for(int j=(i+1); j<n; j++) {

                if(arr[i] > arr[j]) { // jodi wrong order e elementsGulo thake, tahole swap korte hobe

                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");

        for(int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
