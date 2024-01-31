package homework;

public class Reporter implements IReporter {

    @Override
    public void report(IUser user) {
        System.out.println("Report for user: " + user.getName());
    }
}
