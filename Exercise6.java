import java.util.Scanner;
public class Exercise6 {
    public static void main (String [] args) {
        Scanner s = new Scanner (System.in);
        final int X = 10;
        final int Y = 20;
        final int Z = 30;
        System.out.println("Введите значение Т: ");
        int T = s.nextInt();
        if (T==X || T==Y || T==Z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");

    }
}
