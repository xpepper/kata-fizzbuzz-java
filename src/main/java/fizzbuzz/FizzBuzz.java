//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

    private final FizzRule fizzRule = new FizzRule();
    private final BuzzRule buzzRule = new BuzzRule();
    private final ToStringRule toStringRule = new ToStringRule();

    public String translate(int number) {
        String result = "";
        result += fizzRule.evaluate(number);
        result += buzzRule.evaluate(number);
        result = plainNumber(number, result);

        return result;
    }

    private String plainNumber(int number, String result) {
        if (result.isEmpty())
            result += toStringRule.evaluate(number);
        return result;
    }

}
