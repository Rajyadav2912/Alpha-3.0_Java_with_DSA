
public class _92ShortestPath {
    public static float ShortestPath(String Path) {
        int x = 0, y = 0;
        for (int i = 0; i < Path.length(); i++) {
            char direction = Path.charAt(i);
            if (direction == 'N') {
                y++;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'S') {
                y--;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(ShortestPath(Path));
    }
}
