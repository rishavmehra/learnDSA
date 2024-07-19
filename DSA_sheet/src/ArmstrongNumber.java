public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 3702212;
        System.out.println(arms(number));
    }

    private static boolean arms(int x) {
            int org = x;
            int rev =0;
            while (x!=0){
                int lastdig = x%10;
                rev += lastdig * lastdig * lastdig;
                x=x/10;
            }
             return rev==org;
    }
}

