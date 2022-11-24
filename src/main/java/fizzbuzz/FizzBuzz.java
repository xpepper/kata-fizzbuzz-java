//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

public class FizzBuzz {

    private final fizzbuzz.rule.Rule fizzRule = new fizzbuzz.rule.FizzRule();
    private final fizzbuzz.rule.Rule buzzRule = new fizzbuzz.rule.BuzzRule();
    private final fizzbuzz.rule.Rule toStringRule = new fizzbuzz.rule.ToStringRule();
    private final fizzbuzz.rule.Rule sumRule = new fizzbuzz.rule.SumRule(fizzRule, buzzRule);
    private final fizzbuzz.rule.Rule orRule = new fizzbuzz.rule.OrRule(sumRule, toStringRule);

    public String translate(int number) {
        return orRule.apply(number);
    }

}
