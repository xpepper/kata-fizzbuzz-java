package fizzbuzz.rule;

public class RuleForMultipleOf extends Rule {

    private final int baseNumber;
    private final String stringToApply;

    public RuleForMultipleOf(int baseNumber, String stringToApply) {
        this.baseNumber = baseNumber;
        this.stringToApply = stringToApply;
    }

    @Override
    public boolean appliesTo(int number) {
        return number % baseNumber == 0;
    }

    @Override
    protected String doApply(int number) {
        return stringToApply;
    }
}
