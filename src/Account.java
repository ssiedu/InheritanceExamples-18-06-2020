public  class Account  {
    int ano;
    String name;
    int balance;
    
    public final void computeInterest(int amount){
        System.out.println("Interest Amount : "+(amount*10/100));
    }
    public void setAccountInfo(int ano, String name, int balance){
        this.ano=ano;
        this.name=name;
        this.balance=balance;
    }
    public void showAccountInfo(){
        System.out.println(ano+","+name+","+"balance");
    }
}
