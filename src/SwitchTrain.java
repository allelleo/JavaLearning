import java.util.Scanner;

public class SwitchTrain {
    public static void main(String[] args) {
        System.out.println("Ваша оценка [0, 1, 2, 3, 4, 5]>>>");
        Scanner in = new Scanner(System.in);
        int rating = in.nextInt();

        switch (rating){
            case 0:
                System.out.println(":(");
                break;
            case 1:
                System.out.println(":@");
                break;
            case 2:
                System.out.println(":#");
                break;
            case 3:
                System.out.println(":|");
                break;
            case 4:
                System.out.println(":=");
                break;
            case 5:
                System.out.println(":)");
                break;
            default:
                System.out.println("Не верная оценка");
                break;

        }

        in.close();
    }
}