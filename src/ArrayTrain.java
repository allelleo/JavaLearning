import java.util.Scanner;

public class ArrayTrain {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Введи число под номером " + (i+1));
            numbers[i] = in.nextInt();
        }

        in.close();

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}