public class atoi {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0, n = s.length();
        long num = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (sign * num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int) (sign * num);
    }

    // Main method to test the myAtoi function
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
            "42",
            "   -42",
            "4193 with words",
            "words and 987",
            "-91283472332",
            "91283472332",
            ""
        };

        System.out.println("Testing myAtoi function:");
        for (String test : testStrings) {
            System.out.println("Input: \"" + test + "\"");
            System.out.println("Output: " + myAtoi(test));
            System.out.println();
        }
    }
}