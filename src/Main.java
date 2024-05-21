import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your age?\n>>>");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age < 18) {
            System.out.println("Доступ запрещен");
        } else {
            System.out.println("Доступ разрешен");
        }

        in.close();
    }
}