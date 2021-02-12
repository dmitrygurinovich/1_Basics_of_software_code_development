package by.epam.basics.loops;

import java.util.Scanner;

/*
5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: an = (2/2^n) + (1/3^n)
 */
public class Task5 {
	public static void main(String[] args) {
		double e;
		double an;
		double min;
		double max;
		double sum;

		sum = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Введите минимальное и максимальное значения последовательности:");

		System.out.print("min: ");
		while (!in.hasNextDouble()){
			in.next();
			System.out.print("min: ");
		}
		min = in.nextDouble();

		System.out.print("max: ");
		while (!in.hasNextDouble()){
			in.next();
			System.out.print("max: ");
		}
		max = in.nextDouble();

		System.out.print("Введите число e: ");
		while (!in.hasNextDouble()){
			in.next();
			System.out.print("Введите число e: ");
		}
		e = in.nextDouble();

		in.close();

		for (double i = min; i <= max; i++) {

			an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(an) >= e) {
				sum = +an;
			}

		}
		System.out.println("Сумма членов ряда равна: " + sum);
	}
}
