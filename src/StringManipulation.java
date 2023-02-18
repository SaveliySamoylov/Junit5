public class StringManipulation {
    public static String reverseAndReplace(String input) {
        if (input.length() < 2) {
            return input;
        }
        String vowels = "aeiouAEIOU";
        StringBuilder reversedString = new StringBuilder(input).reverse();
        for (int i = 0; i < reversedString.length(); i++) {
            char c = reversedString.charAt(i);
            if (vowels.indexOf(c) != -1) {
                reversedString.setCharAt(i, Character.forDigit(c % 32, 10));
            }
        }
        return reversedString.toString();
    }
}
