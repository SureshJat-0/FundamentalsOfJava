package serchingSorting;

public class selection {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 8, 1, 9};

        // Find the smallest element in the array in one loop and take to the first 

        for (int i = 0; i < arr.length; i++){
            int smallest = i;
            for (int j = i;j < arr.length; j++){
                if (arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }
}
