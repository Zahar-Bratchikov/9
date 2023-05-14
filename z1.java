import java.util.*;

public class z1 {
    public static void main(String[] args) {
        char[] mass = new char[10];
        Scanner input = new Scanner(System.in);
        System.out.println("ведите элементы массива");
        for (int i = 0; i < 10; i++) {
            mass[i] = input.next().charAt(0);
        }
        System.out.println("Исходный массив: " + Arrays.toString(mass));

        for (int i = 1; i < mass.length; i++) {
            if (Character.isLowerCase(mass[i])) {
                mass[i - 1] = ' ';
            }
        }

        System.out.println("Измененный массив: " + Arrays.toString(mass));
    }
}
