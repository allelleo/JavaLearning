public class Methods2Train {

    public static int sum(int ...nums){
        int result = 0;

        for (int num:nums){
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {

        int result;

        result = sum(1,2,3);

        System.out.println(result);

    }
}