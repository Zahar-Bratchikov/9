import java.util.Scanner;

public class z8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ведите текст");
        String text = input.nextLine();
        String new_text = "";
        for (int i = 0; i<text.length(); i += 3){
            new_text += text.charAt(i);
        }
        for (int i = 1; i<text.length(); i += 3){
            new_text += text.charAt(i);
        }
        for (int i = 2; i<text.length(); i += 3){
            new_text += text.charAt(i);
        }
        System.out.println("Зашифрованный текст:" + new_text);
    }
}
