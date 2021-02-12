package by.epam.basics.branches;

/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */
public class Task1 {
    public static void main(String[] args) {
        int a;
        int b;

        a = 50;
        b = 40;

        if ((a + b) < 180) {
            if ((180 - (a + b)) == 90) {
                System.out.println("Треугольник существует и он прямоугольный!");
            } else {
                System.out.println("Треугольник существует и он НЕ прямоугольный!");
            }
        } else {
            System.out.println("Треугольник НЕ существует!");
        }
    }
}
