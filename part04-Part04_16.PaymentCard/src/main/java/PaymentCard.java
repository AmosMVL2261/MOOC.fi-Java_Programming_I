public class PaymentCard {
    private double balance;

    public PaymentCard(double balance){
        this.balance = balance;
    }

    public String toString(){
        return "The card has a balance of "+this.balance+" euros";
    }

    public void eatAffordably() {
        double total = this.balance - 2.6;
        if(total>=0){
            this.balance=total;
        }
        
    }

    public void eatHeartily() {
        double total = this.balance - 4.6;
        if(total>=0){
            this.balance=total;
        }
    }

    public void addMoney(double amount) {
        if(amount<0){
            return;
        }
        double total = this.balance + amount;
        if(total>150){
            this.balance=150;
        }else{
            this.balance=total;
        }
    }
}
