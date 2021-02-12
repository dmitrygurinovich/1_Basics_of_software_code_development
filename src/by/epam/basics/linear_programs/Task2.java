package by.epam.basics.linear_programs;

import java.lang.Math;

/*
2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((b+(b^2+4ac)^1/2)/2a)-a^3*c+1/b^2
 */
public class Task2 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result;

		a = 3;
		b = 6;
		c = 7;

		result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + 1 / Math.pow(b, 2);
		
		System.out.println("Ответ: " + result);
	}
}
