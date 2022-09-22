// your code goes here
class BankAccount{
    int balance;
    String name;
    BankAccount(int b,String n){
        this.balance=b;
        this.name=n;
    }
    public void depositFund(int balance){
        this.balance+=balance;
    }
    public boolean withdrawFund(int amount){
        if(amount<=balance){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }
}
