//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import fizzbuzz.rule.*;

public class FizzBuzz {

    private final Rule fooForMultipleOfSix = new FooForMultipleOf(6);
    private final Rule fooForMultipleOfSeven = new FooForMultipleOf(7);
    private final Rule fooRule = new OrRule(fooForMultipleOfSix, fooForMultipleOfSeven);

    private final Rule fizzRule = new FizzRule();
    private final Rule buzzRule = new BuzzRule();
    private final Rule toStringRule = new ToStringRule();
    private final Rule sumRule = new SumRule(fooRule, new SumRule(fizzRule, buzzRule));
    private final Rule orRule = new OrRule(sumRule, toStringRule);

    public String translate(int number) {
        return orRule.apply(number);
    }

    private class FooForMultipleOf extends Rule {

        private final int baseNumber;

        public FooForMultipleOf(int baseNumber) {
            this.baseNumber = baseNumber;
        }

        @Override
        public boolean appliesTo(int number) {
            return number % baseNumber == 0;
        }

        @Override
        protected String doApply(int number) {
            return "Foo";
        }
    }
}
