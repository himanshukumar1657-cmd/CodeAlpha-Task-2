import java.util.*;
public class StockTradingSystem{
    ArrayList<Stock> market=new ArrayList<>();
    User user=new User("Himanshu",100000);
    Scanner sc=new Scanner(System.in);
    public StockTradingSystem(){
        market.add(new Stock("AAPL","Apple",185));
        market.add(new Stock("GOOG","Google",2800));
        market.add(new Stock("TSLA","Tesla",245));
    }
    Stock find(String s){
        for(Stock x:market)if(x.getSymbol().equalsIgnoreCase(s))return x;return null;
    }
    void show(){
        for(Stock s:market)s.display();
    }
    public void start(){
        while(true){
            System.out.println("1.View 2.Buy 3.Sell 4.Portfolio 5.History 6.Exit");
            int c=sc.nextInt();
            switch(c){
                case 1:show();
                break;
                case 2:show();
                System.out.print("Symbol:");
                Stock b=find(sc.next());
                System.out.print("Qty:");
                user.buyStock(b,sc.nextInt());
                break;
                case 3:System.out.print("Symbol:");
                Stock s=find(sc.next());
                System.out.print("Qty:");
                user.sellStock(s,sc.nextInt());
                break;
                case 4:
                user.showPortfolio(market);
                break;
                case 5:user.showHistory();
                break;
                default:return;
            }
        }
    }
}