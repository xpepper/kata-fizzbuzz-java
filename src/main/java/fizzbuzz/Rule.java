package fizzbuzz;

public interface Rule {
    String apply();

    boolean appliesTo(int number);
}
