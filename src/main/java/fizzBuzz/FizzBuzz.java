//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

	public String translate(int number) {
		if (((number % 5) == 0) && ((number % 7) == 0)) // A multiple of both?
			return "FizzBuzz";
		else if ((number % 5) == 0)
			return "Fizz"; // else a multiple of 5?
		else if ((number % 7) == 0)
			return "Buzz"; // else a multiple of 7?
		else
			return String.valueOf(number); // else just print it
	}
}