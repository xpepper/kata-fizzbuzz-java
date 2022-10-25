//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

    public String translate(int number) {
        String result = "";
        result = fizz(number, result);
        result = buzz(number, result);
        result = plainNumber(number, result);

        return result;
    }

    private String plainNumber(int number, String result) {
        if (result.isEmpty())
            result += String.valueOf(number);
        return result;
    }

    private String buzz(int number, String result) {
        if (isMultipleOfSeven(number))
            result += "Buzz";
        return result;
    }

    private String fizz(int number, String result) {
        if (isMultipleOfFive(number))
            result += "Fizz";
        return result;
    }

    private boolean isMultipleOfSeven(int number) {
        return (number % 7) == 0;
    }

    private boolean isMultipleOfFive(int number) {
        return (number % 5) == 0;
    }
}
