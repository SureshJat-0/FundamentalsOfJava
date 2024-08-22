public class Insertion {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {7, 8, 2, 1, 3};

        // Two part of array one is shorted and another is unshorted

        for (int i = 1;i < arr.length; i++){
            int current = arr[i];

            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // Placment
            arr[j+1] = current;

        }
        printArr(arr);
    }
}
