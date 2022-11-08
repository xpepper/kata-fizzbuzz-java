//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

    private final FizzRule fizzRule = new FizzRule();
    private final BuzzRule buzzRule = new BuzzRule();
    private final SumRule sumRule = new SumRule(fizzRule, buzzRule);
    private final ToStringRule toStringRule = new ToStringRule();

    public String translate(int number) {
        String result = sumRule.evaluate(number);

        if (result.isEmpty())
            return toStringRule.evaluate(number);

        return result;
    }

}
