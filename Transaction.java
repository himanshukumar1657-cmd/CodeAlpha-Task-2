public class Transaction{
    String type,symbol;
    int quantity;
    double amount;
    public Transaction(String t,String s,int q,double a){
        type=t;symbol=s;quantity=q;amount=a;
    }
    public void display(){
        System.out.println(type+" | "+symbol+" | Qty:"+quantity+" | ₹"+amount);
    }
}