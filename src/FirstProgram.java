import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Your age?\n>>>");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access ok");
        }

        in.close();
    }
}