package fizzbuzz;

public class OrRule implements Rule {
    private final SumRule sumRule;
    private final ToStringRule toStringRule;

    public OrRule(SumRule sumRule, ToStringRule toStringRule) {
        this.sumRule = sumRule;
        this.toStringRule = toStringRule;
    }

    @Override
    public String apply(int number) {
        String result = sumRule.apply(number);

        if (result.isEmpty())
            return toStringRule.apply(number);

        return result;
    }

    @Override
    public boolean appliesTo(int number) {
        return false;
    }
}
