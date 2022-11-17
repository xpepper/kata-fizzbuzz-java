//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

    private final Rule fizzRule = new FizzRule();
    private final Rule buzzRule = new BuzzRule();
    private final Rule sumRule = new SumRule(fizzRule, buzzRule);
    private final Rule toStringRule = new ToStringRule();

    public String translate(int number) {
        return new OrRule(sumRule, toStringRule).apply(number);
    }

}
