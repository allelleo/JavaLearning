import java.util.Scanner;

public class WhileTrain {
    public static void main(String[] args) {
        System.out.println("Введи число а я его угадаю>>>");
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();
        int computerNumber = 0;

        while (true){
            if (computerNumber != userNumber){
                computerNumber ++;
            } else{
                System.out.println("Твоё число = " + computerNumber);
                break;
            }
        }

        in.close();
    }
}