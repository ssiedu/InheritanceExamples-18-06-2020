
public class SavingAccountForNRI extends SavingAccount {
    String country;
    public void setCountry(String country){
        this.country=country;
    }
    public void showCountry(){
        System.out.println(country);
    }
    public void showInterestRate(){
        System.out.println("Interest Rate For NRI Is 10%");
    }
    public static void main(String args[]){
        SavingAccountForNRI ob=new SavingAccountForNRI();
        ob.setAccountInfo(1001, "XYZ", 50000);  //Account
        ob.setType("Single");//SavingAccount
        ob.setCountry("USA");//Own
        ob.showAccountInfo();
        ob.showType();
        ob.showCountry();
        ob.showInterestRate();
                
    }
}
