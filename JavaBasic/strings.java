
public class strings {
    public static void main(String args[]) {
        String name1 = "Tony";
        String name2 = "Tony";

        // Joint
        String fullName = name1 + name2;
        System.out.println(fullName);

        // char at any index
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // compare
        if (name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // DO NOT USE == to check for string equality
        // Gives correct answer here
        if (name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        // Gives incorrect answer here
        if (new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

        //sub String
        String name = "TonyStark";
        System.out.println(name.substring(0, 4));


        //ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //ToString Method of String class
        int number2 = 123;
        String str2 = Integer.toString(number2);
        System.out.println(str2.length());




    }
}
