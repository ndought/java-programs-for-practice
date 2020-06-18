public class ReverseString {
    public static void main(String[] args) {
        String r = reverseString("reve dneirflrig tseb eht si adnamA");
        System.out.println(r);
    }

    public static String reverseString(String s) {
        char [] letters = new char[s.length()];

        int letterIndex = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        String reverse = " ";
        for (int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}
