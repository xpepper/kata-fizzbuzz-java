package fizzbuzz.rule;

public class FooRule extends Rule {
    @Override
    public boolean appliesTo(int number) {
        return number % 6 == 0;
    }

    @Override
    protected String doApply(int number) {
        return "Foo";
    }
}
