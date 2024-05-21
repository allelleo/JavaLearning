import java.util.Scanner;

public class ForTrain {
    public static void main(String[] args) {
        System.out.println("Сколько раз тебя поблогодарить\n>>>");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        for (int i = 0; i < count; i++){
            System.out.println("Спасибо!");
        }

        in.close();
    }
}