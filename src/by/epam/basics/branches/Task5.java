package by.epam.basics.branches;

/*
5. Вычислить значение функции (x^2)-3x+9, если x<=3; 1/((x^3)+6), если x > 3.
 */
public class Task5 {
    public static void main(String[] args) {
        double x;
        double f;

        f = 0;
        x = -4;

        if (x <= 3) {
            f = x * x - 3 * x + 9;
        } else if (x > 3) {
            f = 1 / (x * x * x) + 6;
        }

        System.out.println("F(x) = " + f);
    }
}
