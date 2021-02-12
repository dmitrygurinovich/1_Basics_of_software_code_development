package by.epam.basics.linear_programs;

/*
6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае. Рисунок в задании.
 */
public class Task6 {
	public static void main(String[] args) {
		int x;
		int y;
		boolean answer;

		x = 2;
		y = 4;
		
		if ((((y >= 0) && (y <= 4)) && ((x >= -2) && (x <= 2)))
				|| (((y <= 0) && (y >= -3)) && ((x >= -4) && (x <= 4)))) {
			answer = true;
		} else {
			answer = false;
		}

		System.out.println(answer);
	}

}
