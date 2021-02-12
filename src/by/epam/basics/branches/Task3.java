package by.epam.basics.branches;

/*
3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Task3 {
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;

        x1 = -2;
        y1 = 5;
        x2 = 4;
        y2 = 3;
        x3 = 16;
        y3 = -1;

        if (((x1 - x2) * (y3 - y2)) == ((x3 - x2) * (y1 - y2))) {
            System.out.println("Точки А, B, C лежат на одной прямой!");
        } else {
            System.out.println("Точки А, B, C не лежат на одной прямой!");
        }
    }
}
