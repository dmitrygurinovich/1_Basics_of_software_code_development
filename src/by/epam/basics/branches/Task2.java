package by.epam.basics.branches;

/*
2. Найти max{min(a, b), min(c, d)}.
 */
public class Task2 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int max;

		a = 3;
		b = 56;
		c = 18;
		d = 23;

		if (a < b) {
			if (c < d) {
				if (a > c) {
					max = a;
				} else {
					max = c;
				}
			} else {
				if (a > d) {
					max = a;
				} else {
					max = d;
				}
			}
		} else {
			if (c < d) {
				if (b > c) {
					max = b;
				} else {
					max = c;
				}
			} else {
				if (b > d) {
					max = b;
				} else {
					max = d;
				}
			}
		}

		System.out.println("max = " + max);
		// вариант проще: max = Math.max(Math.min(a, b), Math.min(c, d));
	}
}
