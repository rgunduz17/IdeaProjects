package day21_whileLoops;

import java.util.Scanner;

public class do_While {

	public static void main(String[] args) {

		boolean A = false;

		while (A) {

			System.out.println("Hello");

		}

		do {
			System.out.println("Hello");
		} while (A);

		int x = 1;
		do {
			if (x % 2 == 0) {
				System.out.print(x + " ");
			}
			x++;
		} while (x <= 100);

		System.out.println("======================");

		do {
			System.out.println("hello world");
			break;

			// System.out.println("hello Cybertek"); // can't give anything after break;
			// it was already out of loop at line 33

		} while (true);

	}
}
