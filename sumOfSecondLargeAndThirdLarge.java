import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {10, 9,31,26,56,78,};
        int sum = sumOfSecondAndThirdLargest(values);
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }

    public static int sumOfSecondAndThirdLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("The Array should have at least 2 elements");
            return -1;
        }

        Arrays.sort(arr);

        
        int second_large = arr[arr.length - 2];
        
        int third_large = arr[arr.length - 3];

        return second_large + third_large;
    }
}