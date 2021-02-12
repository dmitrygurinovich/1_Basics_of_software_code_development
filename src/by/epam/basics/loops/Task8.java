package by.epam.basics.loops;

/*
8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */
public class Task8 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int tempInt;
		int digit1;
		int digit2;
		int lengthNum1;
		int lengthNum2;

		num1 = 12345;
		num2 = 6578;

		tempInt = num2;

		lengthNum1 = (Integer.toString(num1)).length();
		lengthNum2 = (Integer.toString(num2)).length();

		for (int i = 0; i < lengthNum1; i++) {

			digit1 = num1 % 10;
			num1 -= digit1;
			num1 /= 10;

			for (int k = 0; k < lengthNum2; k++) {

				digit2 = tempInt % 10;
				tempInt -= digit2;
				tempInt /= 10;

				if (digit1 == digit2) {
					System.out.print(digit1 + " ");
				}

			}
			tempInt = num2;
		}
	}
}
