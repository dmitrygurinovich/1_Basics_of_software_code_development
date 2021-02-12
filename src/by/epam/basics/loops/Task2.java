package by.epam.basics.loops;

/*
2. Вычислить значения функции на отрезке [а,b] c шагом h:
y = x, если x>2
y = -x, если х <= 2
 */
public class Task2 {
	public static void main(String[] args) {
		int a;
		int b;
		int h;
		int x;
		int f;

		x = 0;
		a = 2;
		b = 18;
		h = 2;

		while (x <= b) {
			if (x > a) {
				f = x;
				System.out.print(f + "\t");
				x += h;
			} else {
				f = -x;
				System.out.print(f + "\t");
				x += h;
			}
		}
	}
}
