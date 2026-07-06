import java.util.*;
public class User{
    private String name;
    private double balance;
    HashMap<String,Integer> portfolio=new HashMap<>();
    ArrayList<Transaction> history=new ArrayList<>();
    public User(String n,double b){
        name=n;balance=b;
    }
    public double getBalance(){
        return balance;
    }
    public void buyStock(Stock st,int q){
        double c=st.getPrice()*q;
        if(c>balance){
            System.out.println("Insufficient Balance");
            return;
        }
        balance-=c;portfolio.put(st.getSymbol(),portfolio.getOrDefault(st.getSymbol(),0)+q);
        history.add(new Transaction("BUY",st.getSymbol(),q,c));
    }
    public void sellStock(Stock st,int q){
        if(!portfolio.containsKey(st.getSymbol())||portfolio.get(st.getSymbol())<q)return;balance+=st.getPrice()*q;portfolio.put(st.getSymbol(),portfolio.get(st.getSymbol())-q);
        history.add(new Transaction("SELL",st.getSymbol(),q,st.getPrice()*q));
    }
    public void showPortfolio(java.util.ArrayList<Stock> m){
        for(Stock s:m)if(portfolio.containsKey(s.getSymbol()))System.out.println(s.getSymbol()+" "+portfolio.get(s.getSymbol()));
        System.out.println(balance);
    }
    public void showHistory(){
        for(Transaction t:history)t.display();
    }
}