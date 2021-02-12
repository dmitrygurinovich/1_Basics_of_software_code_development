package by.epam.basics.linear_programs;

/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
 */
public class Task4 {
	public static void main(String[] args) {
		double a;
		double result;

		a = 535.256;
		
		result = ((int) a / 1000.0) + (a * 1000) % 1000;
		
		System.out.println("Ответ: " + result);
	}
}
