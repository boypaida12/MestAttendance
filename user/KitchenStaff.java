package user;

public class KitchenStaff extends BaseUser{

    public KitchenStaff(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        //TODO Auto-generated constructor stub
    }

    @Override
    void login(String email) {
        // TODO Auto-generated method stub
        System.out.println("Kitchen Staff logged in");
    }
    
}
