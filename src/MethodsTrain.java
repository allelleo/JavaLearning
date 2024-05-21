import java.util.Scanner;

public class MethodsTrain {

    public static void welcome(String name){
        System.out.println("Welcome " + name);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Name = in.nextLine();
        in.close();

        welcome(Name);

    }
}