# Basic Problems

## Reverse Integer Algorithm Explanation

This README provides a clear breakdown of the algorithm to reverse an integer while considering 32-bit signed integer constraints.

### Steps

1. **Initialize `result` to 0:**
    - The variable `result` is used as an accumulator for the reversed integer.

2. **Loop through digits:**
    - Employ a `while` loop to process each digit of the input integer `x` until it reaches 0.
    - Extract the last digit of `x` using the modulo operation (`x % 10`).
    - Store the extracted digit in the variable `lastDigit`.

3. **Build the reversed result:**
    - Calculate the new reversed result by taking the existing `result`, multiplying it by 10 (left-shifting its digits by one position), and then adding the `lastDigit`.

4. **Check for overflow/underflow:**
    - To prevent integer overflow or underflow, a check is performed. Compare the new result minus the `lastDigit` divided by 10 with the prior `result`. If they do not match, an overflow/underflow situation is detected.
    - This safeguard ensures that the reverse operation remains within the range of a 32-bit signed integer.

5. **Update `result` and reduce `x`:**
    - Upon successful overflow/underflow verification, update `result` with the new reversed result.
    - Remove the last digit of `x` by dividing it by 10, effectively shifting its digits right by one position.

6. **Return the result:**
    - Once the loop concludes (as `x` becomes 0), the variable `result` contains the reversed integer.

7. **Return 0 for invalid reversals:**
    - In scenarios where the reversal process results in an overflow or underflow, the function returns 0, aligning with the specified problem requirements.

```java
public class ReverseInteger {
    public static void main(String[] args) {
        int x =123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            int newResult = result * 10 + lastDigit;
            if ((newResult - lastDigit) / 10 != result) {
                return 0;
            }

            result = newResult;
            x /= 10;
        }
        return result;
    }
}

```