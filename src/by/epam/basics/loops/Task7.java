package by.epam.basics.loops;

import java.util.Scanner;

/*
7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */
public class Task7 {
	public static void main(String[] args) {
		int m;
		int n;
		int i;

		Scanner in = new Scanner(System.in);

		System.out.println("Введите границы отрезка:\nm: ");
		while (!in.hasNextInt()){
			in.next();
			System.out.println("Введите границы отрезка:\nm: ");
		}
		m = in.nextInt();

		System.out.println("n: ");
		while (!in.hasNextInt()){
			in.next();
			System.out.println("n: ");
		}
		n = in.nextInt();

		in.close();
		
		while (m < n) {
			System.out.print("Делители числа " + m + ":\t");
			
			for (i = 2; i < m; i++) {
				if (m % i == 0) {
					System.out.print(i + " ");
				}
			}
			
			m++;
			System.out.print("\n");
		}
	}
}
