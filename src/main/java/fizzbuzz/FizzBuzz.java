//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import fizzbuzz.rule.*;

public class FizzBuzz {

    private final Rule fooForMultipleOfSix = new RuleForMultipleOf(6, "Foo");
    private final Rule fooForMultipleOfSeven = new RuleForMultipleOf(7, "Foo");
    private final Rule fooRule = new OrRule(fooForMultipleOfSix, fooForMultipleOfSeven);

    private final Rule fizzRule = new FizzRule();
    private final Rule buzzRule = new BuzzRule();
    private final Rule toStringRule = new ToStringRule();
    private final Rule sumRule = new SumRule(fooRule, new SumRule(fizzRule, buzzRule));
    private final Rule orRule = new OrRule(sumRule, toStringRule);

    public String translate(int number) {
        return orRule.apply(number);
    }

}
