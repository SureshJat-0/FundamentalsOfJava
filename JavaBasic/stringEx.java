import java.util.Scanner;

public class stringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int totLength = 0;

        String[] userIn = new String[size];

        for (int i = 0;i<size; i++){
            userIn[i] = sc.next();
            totLength += userIn[i].length();

        }
        System.out.println(totLength);


        // Exercise 2 
        String input = sc.nextLine();

        for(int i = 0; i< input.length();i++){
            if(input.charAt(i) == 'e'){
                input = input.substring(0, i) + 'i' + input.substring(i+1);
            }
        }
        System.out.println(input);

        // Exercise 3 -> for only @gmail.com
        // xyz@gmail.com
        String email = sc.nextLine();
        
        int len = email.length();
        String userNmae = email.substring(0, len-10);
        System.out.println("User Name is " + userNmae);


        // Exercise 3 method 2

        String UserN = "";
        for (int i = 0;i<email.length();i++){
            if (email.charAt(i) == '@'){
                break;
            }else{
                UserN += email.charAt(i);
            }
        }
        System.out.println(UserN);

        
    }
}
