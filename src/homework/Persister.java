package homework;

public class Persister implements IPersister {

    @Override
    public void save(IUser user) {
        System.out.println("Save user: " + user.getName());
    }

}
