public class _94Substring {
    public static void Substring(String str, int St_index, int End_index) {
        String SubString = " ";
        for (int i = St_index; i < End_index; i++) {
            SubString += str.charAt(i);
        }
        System.out.print(SubString);
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        // java has already exist in substring function
        System.out.println(str.substring(0, 5));
        Substring(str, 0, 5);
    }
}
