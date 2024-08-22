
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Suresh");

        // Get char
        System.out.println(sb.charAt(0));
        System.out.println(sb);

        // Set char
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        // Insert char at any index
        sb.insert(1, 'A');
        System.out.println(sb);

        // Delete char
        // 0 is included but 1 is not included
        // ex : (0, 4) => 0 to 4
        sb.delete(0, 2);
        System.out.println(sb);

        // Append char (Append at the end only)
        sb.append("jat");
        System.out.println(sb);

        // Length of sb
        sb.length();

    }

}
