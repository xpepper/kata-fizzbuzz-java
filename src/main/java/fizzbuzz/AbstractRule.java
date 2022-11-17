package fizzbuzz;

public abstract class AbstractRule implements Rule {
    @Override
    public abstract boolean appliesTo(int number);

    @Override
    public String apply(int number) {
        if (!appliesTo(number))
            throw new RuntimeException("Cannot apply rule " + this.getClass());

        return doApply(number);
    }

    protected abstract String doApply(int number);
}
