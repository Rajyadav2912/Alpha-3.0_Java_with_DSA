public class _02FindSubsets {
    public static void FindSubsets(String str, int i, String ans) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // when choice Yes
        FindSubsets(str, i + 1, ans + str.charAt(i));
        // when choice No
        FindSubsets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        FindSubsets(str, 0, "");
    }
}
