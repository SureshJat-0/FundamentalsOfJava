public class StrBuilderRevers {
    public static void main(String[] args) {

        // First method
        StringBuilder str = new StringBuilder("SureshJat");

        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int end = str.length() - i - 1;

            char frontChar = str.charAt(front);
            char endChar = str.charAt(end);

            str.setCharAt(front, endChar);
            str.setCharAt(end, frontChar);

        }
        System.out.println(str);

        // Second method
        StringBuilder sb = new StringBuilder("Suresh");
        StringBuilder newSb = new StringBuilder("");

        for (int i = sb.length() - 1; i >= 0; i--) {
            newSb.append(sb.charAt(i));
        }
        System.out.println(newSb);

    }
}
