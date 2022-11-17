package fizzbuzz;

public interface Rule {
    String apply(int number);

    boolean appliesTo(int number);
}
