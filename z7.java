import java.util.Scanner;

public class z7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ведите строку");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '!') {
                str = str.substring(0, i) + Integer.toString(i) + str.substring(i + 1);
            }
        }
        System.out.println(str);
    }
}