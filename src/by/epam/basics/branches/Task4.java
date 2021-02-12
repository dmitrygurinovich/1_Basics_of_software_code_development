package by.epam.basics.branches;

/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */
public class Task4 {
	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int y;
		int z;

		a = 20; // Размер отверстия A, B
		b = 16;

		x = 13; // Размер кирпича x, y, z
		y = 12;
		z = 10;

		if (((x < a) && (y < b)) || ((x < b) && (y < a)) || ((x < b) && (z < a)) || ((x < a) && (z < b))
				|| ((y < b) && (z < a)) || ((z < b) && (y < a))) {
			System.out.println("Кирпич пройдет!");
		} else {
			System.out.println("Кирпич не пройдет!");
		}
	}
}
