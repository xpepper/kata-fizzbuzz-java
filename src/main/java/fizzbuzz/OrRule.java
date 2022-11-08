package fizzbuzz;

public class OrRule {
    private final SumRule sumRule;
    private final ToStringRule toStringRule;

    public OrRule(SumRule sumRule, ToStringRule toStringRule) {
        this.sumRule = sumRule;
        this.toStringRule = toStringRule;
    }

    String evaluate(int number) {
        String result = sumRule.evaluate(number);

        if (result.isEmpty())
            return toStringRule.evaluate(number);

        return result;
    }
}
