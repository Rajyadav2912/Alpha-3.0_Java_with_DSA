public class _93CompareStrings {
    public static void main(String[] args) {
        String str = "Raj";
        String str2 = "Raj";
        String str3 = new String("Raj");

        if (str == str2) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }
        //  that we can ues the str .quals 
        if (str.equals(str3)) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }
    }
}
