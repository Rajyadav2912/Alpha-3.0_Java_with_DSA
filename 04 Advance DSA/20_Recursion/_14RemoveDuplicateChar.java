public class _14RemoveDuplicateChar {
    // public static String removeDuplicates(String str) {
    // if (str.length() <= 1) {
    // return str; // Base case: If the string has 0 or 1 character, it has no
    // duplicates.
    // }

    // if (str.charAt(0) == str.charAt(1)) {
    // // If the first two characters are duplicates, recursively remove duplicates
    // // from the rest of the string.
    // return removeDuplicates(str.substring(1));
    // } else {
    // // If the first character is unique, append it to the result and recursively
    // // remove duplicates from the rest of the string.
    // return str.charAt(0) + removeDuplicates(str.substring(1));
    // }
    // }

    // public static void main(String[] args) {
    // String input = "programming";
    // String output = removeDuplicates(input);
    // System.out.println("Original string: " + input);
    // System.out.println("String after removing duplicates: " + output);
    // }
    // public static String removeDuplicates(String str) {
    // boolean[] charSeen = new boolean[256];
    // StringBuilder result = new StringBuilder();

    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // if (!charSeen[ch]) {
    // charSeen[ch] = true;
    // result.append(ch);
    // }
    // }

    // return result.toString();
    // }

    // public static void main(String[] args) {
    // String input = "programming";
    // String output = removeDuplicates(input);
    // System.out.println("Original string: " + input);
    // System.out.println("String after removing duplicates: " + output);
    // }

    // public static void RemoveDuplicatechar(String str, int indx, StringBuilder
    // newstr, boolean[] map) {
    // // base case
    // if (indx == str.length()) {
    // System.out.println(newstr);
    // return;
    // }
    // // process
    // char currChar = str.chatAt(indx);
    // if (map[currChar - 'a']) {
    // RemoveDuplicatechar(str, indx + 1, newstr, map);
    // } else {
    // map[currChar - 'a'] = true;
    // RemoveDuplicatechar(str, indx + 1, newstr.append(currChar), map);
    // }
    // }

    // public static void main(String[] args) {
    // // StringBuilder str = new String("");
    // String str = "appnnnacollege";
    // RemoveDuplicatechar(str, 0, new String(""), new boolean[26]);
    // }
    // public class RemoveDuplicatesRecursive {
    public static void removeDuplicateChar(String str, int index, StringBuilder newStr, boolean[] map) {
        // Base case: If we have processed all characters in the string, print the new
        // string.
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Process the current character
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            // If the character is already in the map (i.e., it's a duplicate), skip it and
            // move to the next character.
            removeDuplicateChar(str, index + 1, newStr, map);
        } else {
            // If the character is not a duplicate, mark it as seen in the map, and add it
            // to the new string.
            map[currChar - 'a'] = true;
            removeDuplicateChar(str, index + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnnacollege";
        removeDuplicateChar(str, 0, new StringBuilder(), new boolean[26]);
    }
}
