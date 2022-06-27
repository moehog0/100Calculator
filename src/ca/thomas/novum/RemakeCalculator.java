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

	double[] numbers = new double[2];
	private int mode;
	private int operator;

	private void StartCalculator() {

		Scanner sc = new Scanner(System.in);

		while (mode == 0) {
			System.out.println("Please type the first number: ");
			numbers[0] = sc.nextDouble();
			System.out.println("Please type the second number: ");
			numbers[1] = sc.nextDouble();
			System.out.println("Choose an operator: 1 = + | 2 = - | 3 = * | 4 = / |");
			break;
	}
		switch (operator = sc.nextInt()) {
			case 1 : Add(); break;
			case 2 : Subtract(); break;
			case 3 : Multiply(); break;
			case 4 : Divide(); break;
		}
	}
	private void Add() {
		System.out.println(numbers[0] + numbers[1]);
	}
	private void Subtract() {
		System.out.println(numbers[0] - numbers[1]);
	}
	private void Multiply() {
		System.out.println(numbers[0] * numbers[1]);
	}
	private void Divide() {
		System.out.println(numbers[0] / numbers[1]);
	}
}
