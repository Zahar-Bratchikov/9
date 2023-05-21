import java.util.*; 
  
 public class z_3 { 
     public static char vvod() { 
         Scanner input = new Scanner(System.in); 
         String x = input.nextLine(); 
         char t; 
         while (true) { 
             if (x.length() != 1) { 
                 System.out.println("Элемент массива должен быть одним символом"); 
                 x = input.nextLine(); 
             } else { 
                 t = x.charAt(0); 
                 break; 
             } 
         } 
         return t; 
     } 
     public static String vvodstr() { 
         Scanner input = new Scanner(System.in); 
         return input.nextLine(); 
     } 
  
     public static int a(char[] arr) { 
         int counta = 0; 
         for (Character character : arr) { 
             if (String.valueOf(character).matches("[а-я]")) { 
                 counta += 1; 
             } 
         } 
         return counta; 
     } 
  
     public static int b(char[] arr, char s) { 
         int countb = 0; 
         for (Character character : arr) { 
             if (character == s) { 
                 countb += 1; 
             } 
         } 
         return countb; 
     } 
  
     public static boolean c(char[] arr, String inputNumber) { 
         int count = 0; 
         for (char ch : arr) { 
             if (Character.isDigit(ch) && inputNumber.contains(String.valueOf(ch))) { 
                 count++; 
                 if (count >= 2) { 
                     return true; 
                 } 
             } 
         } 
         return false; 
     } 
  
     public static boolean d(char[] arr) { 
         String stringArray = new String(Arrays.toString(arr)); 
         return stringArray.matches(".*\\(.*\\)|.*\\[.*\\]|.*\\{.*\\}"); 
     } 
  
  
     public static boolean e(char[] arr) { 
         for (int i = 0; i < arr.length - 1; i++) { 
             if (String.valueOf(arr[i]).equals(" ") && String.valueOf(arr[i + 1]).equals(" ")) { 
                 return true; 
             } 
         } 
         return false; 
     } 
  
     public static boolean f(char[] arr) { 
         for (int i = 0; i < arr.length - 3; i++) { 
             if (Character.isDigit(arr[i]) && 
                     Character.isDigit(arr[i + 1]) && 
                     Character.isDigit(arr[i + 2])) { 
                 int num1 = arr[i]; 
                 int num2 = arr[i + 1]; 
                 int num3 = arr[i + 2]; 
                 if (num1 > num2 && num2 > num3) { 
                     return true; 
                 } 
             } 
         } 
         return false; 
     } 
  
     public static void main(String[] args) { 
         Scanner input = new Scanner(System.in); 
         System.out.println("Введите длинну массива"); 
         int len = input.nextInt(); 
         char[] arr = new char[len]; 
         for (int i = 0; i < arr.length; i++) { 
             System.out.println("Введите элемент массива " + (i + 1)); 
             arr[i] = vvod(); 
         } 
         System.out.println("Введите символ для поиска в пункте б"); 
         char b = vvod(); 
         System.out.println("Введите число для поиска в пункте в"); 
         String c = vvodstr(); 
         System.out.printf("а) Кол-во строчных русских букв %d\n", +a(arr)); 
         System.out.println("б) Введенный символ входит в последовательность " + b(arr, b)); 
         if (c(arr, c)) { 
             System.out.println("в) Среди символов есть 2 и более цифры, входящие в число " + c); 
         } else { 
             System.out.println("в) Среди символов нет 2 и более цифр, входящих в введённое вами число, или вы ввели не число"); 
         } 
         if (d(arr)){ 
             System.out.println("г) Последовательность содержит пару соседствующих закрытых скобок"); 
         }else { 
             System.out.println("г) Последовательность не содержит пару соседствующих закрытых скобок"); 
         } 
         if (e(arr)) { 
             System.out.println("д) в последовательности есть более двух подряд идущих пробелов"); 
         } else { 
             System.out.println("д) в последовательности нет более двух подряд идущих пробелов"); 
         } 
         if (f(arr)) { 
             System.out.println("е) Существуют такие натуральные i и j, что i<k<j<n и " + 
                     "si, и si+1 убывающая последовательность цифр, a sj и sj+1 возрастающая последовательность чисел."); 
         } else { 
             System.out.println("е) Не найдено таких натуральных i и j, что i<k<j<n и " + 
                     "si, и si+1 убывающая последовательность цифр, a sj и sj+1 возрастающая последовательность чисел."); 
         } 
     } 
 }