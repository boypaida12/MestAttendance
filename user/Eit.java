package user;

public class Eit extends BaseUser {

    public Eit(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        //TODO Auto-generated constructor stub
    }

    @Override
    void login(String email) {
        // TODO Auto-generated method stub
        System.out.println("EIT logged in");
    }

}
