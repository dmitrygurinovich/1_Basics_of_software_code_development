package by.epam.basics.linear_programs;

/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class Task5 {
	public static void main(String[] args) {
		int secondIn;
		int hours;
		int minutes;
		int seconds;

		secondIn = 423435;
		
		hours = (secondIn - secondIn % 3600) / 3600;
		minutes = (secondIn % 3600 - ((secondIn % 3600) % 60)) / 60;
		seconds = (secondIn % 3600) % 60;
		
		System.out.println(hours + " ч " + minutes + " мин " + seconds + " с");
	}
}
