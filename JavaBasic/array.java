public class array {
    public static void main(String[] args) {

        // Problem 1 : Find the maximum & minimum number in an array of integers.

        int arr[] = { 4, 2, 6, 9, 7 };

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element in this array is " + largest);
        System.out.println("Smallest element in this array is " + smallest);

        // Problem 2 : Check wheather array is shorted or not

        boolean isArrayshorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isArrayshorted = false;
                System.out.println("Array is not shorted.");
                break;
            }
        }
        if (isArrayshorted) {
            System.out.println("Array is shorted");
        }

        // Extra problems
        
    }
}
