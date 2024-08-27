package serchingSorting;

public class binarySearch {
    public static int binarySearchArr(int[] arr, int target) {
        
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

             if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 8, 9 };
        int target = 2;
        System.out.println(binarySearchArr(arr, target));
        
    }
}