package by.epam.basics.loops;

import java.util.Scanner;

/*
6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task6 {
	public static void main(String[] args) {
		String ch;
		
		Scanner in = new Scanner(System.in);

		System.out.print("Введите символ или строку: ");
		while (!in.hasNextLine()){
			in.next();
			System.out.print("Введите символ или строку: ");
		}
		ch = in.nextLine();

		in.close();
		
		for (int i = 0; i < ch.length(); i++) {
			System.out.println(ch.charAt(i) + " => ASCII: " + (int) (ch.charAt(i)));
		}
	}
}
