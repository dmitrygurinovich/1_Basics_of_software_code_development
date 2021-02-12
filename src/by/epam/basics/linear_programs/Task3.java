package by.epam.basics.linear_programs;

import java.lang.Math;

/*
3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((sinx + cosy)/(cosx - siny)) * tgxy
 */
public class Task3 {
	public static void main(String[] args) {
		double x;
		double y;
		double result;

		x = 10;
		y = 21;

		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
		
		System.out.println("Ответ: " + result);
	}
}
