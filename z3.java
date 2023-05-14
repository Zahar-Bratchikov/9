import java.util.*;

public class z3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите текст ");
        String text = input.nextLine();

        System.out.println("введите длину массива ");
        int len = input.nextInt();

        String[] arr = new String[len];
        String Symbol = "ё1234567890-=йцукенгшщзхъфывапролджэячсмитьбю.!№;%:?*()_+, /[]{}@#$^&~Ё" +
                "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮqwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            char c = Symbol.charAt(random.nextInt(Symbol.length()));
            arr[i] = String.valueOf(c);
        }

        System.out.println(Arrays.toString(arr));

        int cnt = 0;

        for (String s : arr) {
            boolean let = s.matches("[а-я]");
            if (let) cnt++;
        }
        System.out.printf("Кол-во строчных русских букв %d\n", cnt);

        int sc = 0;

        for (String s : arr) {
            if (s.equals(text)) sc++;
        }
        System.out.printf("Символов введеных с клавиатуры: %d\n", sc);

        if (text.matches("[0-9]+")) {
            int dg = Integer.parseInt(text);
            int dgc = 0;
            for (String s : arr) {
                if (s.matches("\\d") && Integer.parseInt(s) == dg) {
                    dgc++;
                }
            }
            if (dgc >= 2) {
                System.out.println("Среди символов есть 2 и более цифры, входящие в число " + dg);
            }
        } else {
            System.out.println("Вы ввели не число");
        }

        int cb = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].matches("\\(\\[\\{") && arr[i + 1].matches("\\)\\]\\}")) cb++;
        }
        System.out.printf("Кол-во соседних закрытых скобок: %d\n", cb);

        int space_counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) space_counter++;
            else space_counter = 0;
            if (space_counter > 2) {
                System.out.println("Обнаружено более двух подряд идущих пробелов.");
                break;
            }
        }

        boolean posled = false;
        for (int i = 0; i < arr.length - 3; i++) {
            if (Character.isDigit(arr[i].charAt(0)) &&
                    Character.isDigit(arr[i + 1].charAt(0)) &&
                    Character.isDigit(arr[i + 2].charAt(0))) {
                int num1 = Integer.parseInt(arr[i]);
                int num2 = Integer.parseInt(arr[i + 1]);
                int num3 = Integer.parseInt(arr[i + 2]);
                if (num1 > num2 && num2 > num3) {
                    posled = true;
                    break;
                }
            }
        }
        if (posled) {
            System.out.println("Существуют такие натуральные i и j, что i<k<j<n и " +
                    "si, и si+1 убывающая последовательность цифр, a sj и sj+1 возрастающая последовательность чисел.");
        } else {
            System.out.println("Не найдено таких натуральных i и j, что i<k<j<n и " +
                    "si, и si+1 убывающая последовательность цифр, a sj и sj+1 возрастающая последовательность чисел.");
        }

    }
}