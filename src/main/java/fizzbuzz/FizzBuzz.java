//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import fizzbuzz.rule.BuzzRule;
import fizzbuzz.rule.FizzRule;
import fizzbuzz.rule.FooRule;
import fizzbuzz.rule.OrRule;
import fizzbuzz.rule.Rule;
import fizzbuzz.rule.SumRule;
import fizzbuzz.rule.ToStringRule;

public class FizzBuzz {

    private final Rule fooRule = new FooRule();
    private final Rule fooForMultipleOfSeven = new FooForMultipleOfSeven();
    private final Rule fizzRule = new FizzRule();
    private final Rule buzzRule = new BuzzRule();
    private final Rule toStringRule = new ToStringRule();
    private final Rule sumRule = new SumRule(new OrRule(fooRule, fooForMultipleOfSeven), new SumRule(fizzRule, buzzRule));
    private final Rule orRule = new OrRule(sumRule, toStringRule);

    public String translate(int number) {
        return orRule.apply(number);
    }

    private class FooForMultipleOfSeven extends Rule {
        @Override
        public boolean appliesTo(int number) {
            return number % 7 == 0;
        }

        @Override
        protected String doApply(int number) {
            return "Foo";
        }
    }
}
