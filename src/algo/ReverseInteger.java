package algo;

// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
public class ReverseInteger {
    public static void main(String[] args) {
        int reversed = reverse(-1200);
        System.out.println(reversed);
    }

    public static int reverse(int x) {
        String str = String.valueOf(x); // 123
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            sb.append('-');
        }
        for (int i = str.length(); i > 0; i--) {
            if (str.charAt(i - 1) != '-') {
                sb.append(str.charAt(i - 1));
            }
        }
        long result = Long.parseLong(sb.toString());
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
