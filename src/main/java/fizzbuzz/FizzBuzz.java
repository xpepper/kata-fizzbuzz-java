//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

	public String translate(int number) {
		if (isMultipleOfFive(number) && isMultipleOfSeven(number))
			return "FizzBuzz";
		if (isMultipleOfFive(number))
			return "Fizz";
		if (isMultipleOfSeven(number))
			return "Buzz";

		return String.valueOf(number);
	}

	private static boolean isMultipleOfSeven(int number) {
		return (number % 7) == 0;
	}

	private static boolean isMultipleOfFive(int number) {
		return (number % 5) == 0;
	}
}
