package ca.thomas.novum;

import java.util.Scanner;

public class RemakeCalculator {

	public static void main(String[] args) {
		RemakeCalculator calculator = new RemakeCalculator();
		try {
			calculator.StartCalculator();

		} catch (Throwable t) {
			System.out.println("Oops, an error occurred: " + t.getMessage());

			t.printStackTrace();
		}
	}
	private double INPUT_NUMBER_ONE = 0;
	private double INPUT_NUMBER_TWO = 0;
	private int mode;
	private int operator;

	private void StartCalculator() {

		Scanner sc = new Scanner(System.in);

		while (mode == 0) {
			System.out.println("Please type the first number: ");
			INPUT_NUMBER_ONE = sc.nextDouble();
			System.out.println("Please type the second number: ");
			INPUT_NUMBER_TWO = sc.nextDouble();
			System.out.println("Choose an operator: 1 = + | 2 = - | 3 = * | 4 = / |");
			break;
	}
		switch (operator = sc.nextInt()) {
			case 1 : Add(); break;
			case 2 : Subtract(); break;
			case 3 : Multiply(); break;
			case 4 : Divide(); break;
		}
		/*switch (operator = sc.nextInt()) {
				case 1:
					Add();
					break;
				case 2:
					Subtract();
					break;
				case 3:
					Multiply();
					break;
				case 4:
					Divide();
					break;
		}*/
	}
	private void Add() {
		System.out.println(INPUT_NUMBER_ONE + INPUT_NUMBER_TWO);
	}
	private void Subtract() {
		System.out.println(INPUT_NUMBER_ONE - INPUT_NUMBER_TWO);
	}
	private void Multiply() {
		System.out.println(INPUT_NUMBER_ONE * INPUT_NUMBER_TWO);
	}
	private void Divide() {
		System.out.println(INPUT_NUMBER_ONE / INPUT_NUMBER_TWO);
	}
}
