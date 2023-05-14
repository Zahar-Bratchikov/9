import java.util.Scanner;

public class z5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку, в которой необходимо посчитать произведение цифр");
        String text =input.nextLine();
        int product = 1;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                count+=1;
                int digit = Character.getNumericValue(ch);
                product *= digit;
            }
        }
        if (count!=0){
            System.out.println("Произведение всех цифр в тексте: " + product);}
        else{
            System.out.println("В тексте отсутствуют цифры");
        }
    }
}