
public class _91IsPalindrome {
    public static boolean IsPlaindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                System.out.println("This String Is_Palindrome : " + str);
                return true;
            }
        }
        System.out.println("This String is not a Palindrome");
        return false;
    }

    public static void main(String[] args) {
        String str = "racecar";
        IsPlaindrome(str);
    }
}
