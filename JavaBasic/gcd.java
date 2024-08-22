public class gcd {

    public static void findGcd(int x, int y){
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++){
            if (x%i == 0 && y%i ==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
    public static void main(String[] args) {
        int x = 14;
        int y = 8;

        findGcd(x, y);
    }
}
