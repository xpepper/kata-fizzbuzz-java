package fizzbuzz;

public class SumRule implements Rule {
    private final Rule firstRule;
    private final Rule secondRule;

    public SumRule(Rule firstRule, Rule secondRule) {
        this.firstRule = firstRule;
        this.secondRule = secondRule;
    }

    String evaluate(int number) {
        return apply(number);
    }

    @Override
    public String apply(int number) {
        return evaluateFizzRule(number) + evaluateBuzzRule(number);
    }

    @Override
    public boolean appliesTo(int number) {
        return false;
    }

    private String evaluateBuzzRule(int number) {
        if (secondRule.appliesTo(number))
            return secondRule.apply(number);
        return "";
    }

    private String evaluateFizzRule(int number) {
        if (firstRule.appliesTo(number))
            return firstRule.apply(number);
        return "";
    }

}
