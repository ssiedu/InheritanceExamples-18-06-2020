
public class CurrentAccount extends Account {
 
    public void computeInterest(int amount){
        System.out.println("Interest Amount for Current Ac. : "+(amount*5/100));
    }
    public static void main(String[] args) {
        CurrentAccount ob=new CurrentAccount();
        ob.computeInterest(50000);
    }
}
//assume that for CurrentAccount interest rate is 5%.