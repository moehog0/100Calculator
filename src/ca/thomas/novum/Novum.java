package ca.thomas.novum;

import java.util.Scanner;

public class Novum {

	private static final int LEFT_HAND_NUMBER = 0;
	private static final int RIGHT_HAND_NUMBER = 1;
	private static final int OPERATOR = 2;

	public static void main(String[] args) {
		Novum novum = new Novum();

		try {
			novum.loop();

		} catch (Throwable t) {
			System.out.println("Oops, an error occurred: " + t.getMessage());

			t.printStackTrace();
		}
	}

	private void loop() {

		Scanner scanner = new Scanner(System.in);
		String message = "";

		int mode = LEFT_HAND_NUMBER;
		double leftHandNumber = 0, rightHandNumber = 0;

		while (!message.equals("exit")) {

			if (mode > OPERATOR)
				mode = 0;

			if (mode == LEFT_HAND_NUMBER)
				System.out.println("Please type the first number.");

			else if (mode == RIGHT_HAND_NUMBER)
				System.out.println("Please type the second number.");

			else
				System.out.println("Please type the operator: + - / * %");

			message = scanner.nextLine();

			if (mode == LEFT_HAND_NUMBER)
				try {
					leftHandNumber = Double.parseDouble(message);
				} catch (NumberFormatException ex) {
					System.out.println("Invalid left hand number: " + message);

					continue;
				}

			else if (mode == RIGHT_HAND_NUMBER)
				rightHandNumber = Double.parseDouble(message);

			else {
				if ("+".equals(message))
					System.out.println(leftHandNumber + " + " + rightHandNumber + " = " + (leftHandNumber + rightHandNumber));

				else if ("-".equals(message))
					System.out.println(leftHandNumber + " - " + rightHandNumber + " = " + (leftHandNumber - rightHandNumber));

				else if ("/".equals(message))
					System.out.println(leftHandNumber + " / " + rightHandNumber + " = " + (leftHandNumber / rightHandNumber));

				else if ("*".equals(message))
					System.out.println(leftHandNumber + " * " + rightHandNumber + " = " + (leftHandNumber * rightHandNumber));

				else if ("%".equals(message))
					System.out.println(leftHandNumber + " % " + rightHandNumber + " = " + (leftHandNumber % rightHandNumber));

				else {
					System.out.println("Invalid operator: " + message);

					continue;
				}
			}

			mode++;
		}

		System.out.println("The program has quit. Good luck!");
	}
}
