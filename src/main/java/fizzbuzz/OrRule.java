package fizzbuzz;

public class OrRule implements Rule {
    private final Rule firstRule;
    private final Rule secondRule;

    public OrRule(Rule firstRule, Rule secondRule) {
        this.firstRule = firstRule;
        this.secondRule = secondRule;
    }

    @Override
    public String apply(int number) {
        String result = firstRule.apply(number);

        if (!firstRule.appliesTo(number))
            return secondRule.apply(number);

        return result;
    }

    @Override
    public boolean appliesTo(int number) {
        return false;
    }
}
