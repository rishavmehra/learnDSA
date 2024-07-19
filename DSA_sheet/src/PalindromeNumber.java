
public  class PalindromeNumber {
    public static void main(String[] args) {
        int number = -121;
        System.out.println(isPalindrome(number));
    }

public static boolean isPalindrome(int x) {
    int originalno = x;
    int rev = 0;
    if (x <0){
        return false;
    }
    while (x!=0){
        int lastdig = x %10;
        if (rev > Integer.MAX_VALUE ||rev < Integer.MIN_VALUE){
            return false;
        }
        rev = (rev*10) + lastdig;
        x = x/10;
    }
    if (rev == originalno){
        return true;
    }
    return false;
}

}