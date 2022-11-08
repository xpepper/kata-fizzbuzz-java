package fizzbuzz;

public class SumRule {
    private final FizzRule fizzRule;
    private final BuzzRule buzzRule;

    public SumRule(FizzRule fizzRule, BuzzRule buzzRule) {
        this.fizzRule = fizzRule;
        this.buzzRule = buzzRule;
    }

    String evaluate(int number) {
        return fizzRule.evaluate(number) + buzzRule.evaluate(number);
    }

}
