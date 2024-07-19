public class Main {
    public static void main(String[] args) {
        int number = 1534236;
        System.out.println(reverse(number));
    }
        public static  int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int lastdig = x % 10;
                if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                    return 0;
                }
                rev = (rev * 10) + lastdig;
                x = x / 10;
            }
            return rev;
        }
}