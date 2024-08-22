public class fibonacci {
    public static void main(String[] args) {
        int n = 6;

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n; i++){
            System.out.println(num1);
            int temp = num2;
            num2 = num1+num2;
            num1 = temp;

        }
    }
}
