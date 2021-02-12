package by.epam.basics.linear_programs;

/*
1. Найти значение функции: z=((a-3)*b/2)+c
 */
public class Task1 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		a = 2.0;
		b = 5.0;
		c = 8.0;
		
		z = ((a - 3) * b / 2) + c;
		
		System.out.println("z = " + z);
	}
}
