package fizzbuzz;

public abstract class Rule {

    public abstract boolean appliesTo(int number);

    public String apply(int number) {
        if (!appliesTo(number))
            throw new RuntimeException("Cannot apply rule " + this.getClass());

        return doApply(number);
    }

    protected abstract String doApply(int number);
}
