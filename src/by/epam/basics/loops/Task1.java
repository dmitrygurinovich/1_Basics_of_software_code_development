package by.epam.basics.loops;

import java.util.Scanner;

/*
1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */
public class Task1 {
	public static void main(String[] args) {
		int number;
		int sum;

		sum = 0;

		Scanner in = new Scanner(System.in);

		System.out.print("Введите число: ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print("Введите число: ");
		}

		number = in.nextInt();
		in.close();

		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
