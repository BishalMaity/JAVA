class BankAccount{

    private String name;
    private double age;

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
}
public class Encapsulation {
    
    public static void main(String[] args) {

        BankAccount account=new BankAccount();

        account.setName("Bishal");
        System.out.println(account.getName());
        
    }
}








