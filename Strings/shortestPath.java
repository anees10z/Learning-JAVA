package Strings;

// Given a route containing 4 directions (E,W,N,S), find the shortest path to reach
// destination :-
// route = "WNEENESENNN"

public class shortestPath {
    public static void main(String[] args) {
        String path = new String("WNEENESENNN");
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); ++i) {
            if (path.charAt(i) == 'N') {
                y++;
            }
            else if (path.charAt(i) == 'E') {
                x++;
            }
            else if (path.charAt(i) == 'W') {
                x--;
            }
            else if (path.charAt(i) == 'S') {
                y--;
            }
            
        }
        System.out.println(x + " " + y);
        int d = (x * x) + (y * y);
        int shortPath = (int) Math.sqrt(d);

        System.out.println("Shortest Path = " + shortPath);
    }
}
