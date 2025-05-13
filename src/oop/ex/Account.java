package oop.ex;

public class Account {
    int balance;
    
    void deposit(int amount){
        balance+=amount;
    }

    void widthdraw(int amount){
        if (balance<amount){
            System.out.println("잔액 부족");
        }
        else{
            balance-=amount;
        }
    }
    
}
