import java.util.*;

public class z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean isValidInput = false;
        do {
            System.out.print("Введите число в 16-ой системе счисления: ");
            input = scanner.nextLine().toUpperCase();
            if (input.matches("[0-9A-F]+")) {
                isValidInput = true;
            } else {
                System.out.println("Ошибка ввода! Введите число в 16-ой системе счисления.");
            }
        } while (!isValidInput);

        int decimal = Integer.parseInt(input, 16);
        String ternary = Integer.toString(decimal, 3);

        char[] result = ternary.toCharArray();
        System.out.println("Число в троичной системе счисления: " + new String(result));
    }
}