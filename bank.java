class BankAccount{
    private double balance;
    BankAccount(double balance){
       System.out.println(this.balance=balance);
    }
    public double getBalance(){
        return balance;
    }
    public void addDeposit(double n){ 
        if(n>0){ 
        balance+=n;
        }
        else{
            System.out.println("Amount invalid");
        }
    }
     public void withdraw(double n){
        balance-=n;
        if(n<0&&n>balance){
            System.out.println("Amount invalid");
        }
    }
}


public class bank{
    public static void main(String[] args) {
     BankAccount b1=new BankAccount(20000);
     b1.addDeposit(65000);
     b1.withdraw(2000);
     System.out.println("New balance: Rs."+b1.getBalance());


    }
}