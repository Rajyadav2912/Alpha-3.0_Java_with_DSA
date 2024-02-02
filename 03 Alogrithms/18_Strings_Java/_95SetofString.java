
public class _95SetofString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "Banana" };
        String Largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (Largest.compareToIgnoreCase(fruits[i]) < 0) {
                Largest = fruits[i];
            }
        }
        System.out.println(Largest);
    }
}
