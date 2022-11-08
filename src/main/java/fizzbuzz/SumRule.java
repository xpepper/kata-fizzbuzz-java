package fizzbuzz;

public class SumRule {
    private final FizzRule fizzRule;
    private final BuzzRule buzzRule;

    public SumRule(FizzRule fizzRule, BuzzRule buzzRule) {
        this.fizzRule = fizzRule;
        this.buzzRule = buzzRule;
    }

    String evaluate(int number) {
        return evaluateFizzRule(number) + buzzRule.evaluate(number);
    }

    private String evaluateFizzRule(int number) {
        if (fizzRule.appliesTo(number))
            return fizzRule.apply();
        return "";
    }

}
