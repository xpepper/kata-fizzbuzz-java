package fizzbuzz;

public class SumRule extends AbstractRule {
    private final Rule firstRule;
    private final Rule secondRule;

    public SumRule(Rule firstRule, Rule secondRule) {
        this.firstRule = firstRule;
        this.secondRule = secondRule;
    }

    @Override
    protected String doApply(int number) {
        return evaluateFizzRule(number) + evaluateBuzzRule(number);
    }

    @Override
    public boolean appliesTo(int number) {
        return firstRule.appliesTo(number) || secondRule.appliesTo(number);
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
