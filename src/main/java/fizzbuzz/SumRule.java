package fizzbuzz;

public class SumRule {
    private final Rule rule;
    private final BuzzRule buzzRule;

    public SumRule(Rule rule, BuzzRule buzzRule) {
        this.rule = rule;
        this.buzzRule = buzzRule;
    }

    String evaluate(int number) {
        return evaluateFizzRule(number) + evaluateBuzzRule(number);
    }

    private String evaluateBuzzRule(int number) {
        if (buzzRule.appliesTo(number))
            return buzzRule.apply();
        return "";
    }

    private String evaluateFizzRule(int number) {
        if (rule.appliesTo(number))
            return rule.apply();
        return "";
    }

}
