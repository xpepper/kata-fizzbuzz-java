package fizzbuzz.rule;

public class OrRule extends Rule {
    private final Rule firstRule;
    private final Rule secondRule;

    public OrRule(Rule firstRule, Rule secondRule) {
        this.firstRule = firstRule;
        this.secondRule = secondRule;
    }

    @Override
    protected String doApply(int number) {
        if (firstRule.appliesTo(number)) {
            return firstRule.apply(number);
        } else {
            return secondRule.apply(number);
        }
    }

    @Override
    public boolean appliesTo(int number) {
        return firstRule.appliesTo(number) || secondRule.appliesTo(number);
    }
}
