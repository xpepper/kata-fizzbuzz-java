package fizzbuzz.rule;

public class BarRule extends Rule {
    @Override
    public boolean appliesTo(int number) {
        return String.valueOf(number).contains("3");
    }

    @Override
    protected String doApply(int number) {
        return "Bar";
    }
}
