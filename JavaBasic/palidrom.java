public class palidrom {
    public static void palidromCheck(String str) {

        boolean isPalidrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                isPalidrom = true;
            } else {
                isPalidrom = false;
                System.out.println(isPalidrom);
                return;
            }
        }
        System.out.println(isPalidrom);
    }

    public static void main(String[] args) {
        String str = "surus";
        palidromCheck(str);
    }
}