public class Account {
    int ano;
    String name;
    int balance;
    
    public void setAccountInfo(int ano, String name, int balance){
        this.ano=ano;
        this.name=name;
        this.balance=balance;
    }
    public void showAccountInfo(){
        System.err.println(ano+","+name+","+"balance");
    }
}
