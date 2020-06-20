//Object=>Account=>SavingAccount

public class SavingAccount extends Account {

    String type;

    public void setType(String type) {
        this.type = type;
    }

    public void showType() {
        System.out.println(type);
    }

    public static void main(String[] args) {
        SavingAccount ac=new SavingAccount();
        ac.setAccountInfo(111, "AAA", 50000);
        ac.setType("Joint");
        ac.showAccountInfo();
        ac.showType();
        ac.computeInterest(50000);
    }
}
