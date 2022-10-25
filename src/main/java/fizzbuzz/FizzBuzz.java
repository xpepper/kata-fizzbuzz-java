//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

    private final FizzRule fizzRule = new FizzRule();

    public String translate(int number) {
        String result = "";
        result += fizzRule.evaluate(number);
        result += buzz(number);
        result = plainNumber(number, result);

        return result;
    }

    private String plainNumber(int number, String result) {
        if (result.isEmpty())
            result += String.valueOf(number);
        return result;
    }

    private String buzz(int number) {
        if (isMultipleOfSeven(number))
            return "Buzz";
        return "";
    }

    private boolean isMultipleOfSeven(int number) {
        return (number % 7) == 0;
    }

}
