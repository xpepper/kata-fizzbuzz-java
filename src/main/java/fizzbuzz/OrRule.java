package fizzbuzz;

public class OrRule {
    private final SumRule sumRule;
    private final ToStringRule toStringRule;

    public OrRule(SumRule sumRule, ToStringRule toStringRule) {
        this.sumRule = sumRule;
        this.toStringRule = toStringRule;
    }

    String evaluate(int number) {
        return apply(number);
    }

    public String apply(int number) {
        String result = sumRule.evaluate(number);

        if (result.isEmpty())
            return toStringRule.apply(number);

        return result;
    }
}
