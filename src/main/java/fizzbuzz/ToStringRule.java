package fizzbuzz;

public class ToStringRule extends Rule {
    public ToStringRule() {
    }

    @Override
    protected String doApply(int number) {
        return String.valueOf(number);
    }

    @Override
    public boolean appliesTo(int number) {
        return true;
    }
}
