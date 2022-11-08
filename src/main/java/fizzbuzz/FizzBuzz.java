//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

    private final Rule rule = new FizzRule();
    private final BuzzRule buzzRule = new BuzzRule();
    private final SumRule sumRule = new SumRule(rule, buzzRule);
    private final ToStringRule toStringRule = new ToStringRule();

    public String translate(int number) {
        return new OrRule(sumRule, toStringRule).evaluate(number);
    }

}
