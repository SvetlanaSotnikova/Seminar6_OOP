package homework;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        IPersister persister = new Persister();
        IReporter reporter = new Reporter();

        persister.save(user);
        reporter.report(user);
    }
}