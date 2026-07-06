public class Stock{
    private String symbol,company;
    private double price;
    public Stock(String s,String c,double p){
        symbol=s;company=c;price=p;
    }
    public String getSymbol(){
        return symbol;
    }
    public String getCompany(){
        return company;
    }
    public double getPrice(){
        return price;
    }
    public void display(){
        System.out.printf("%-10s %-15s ₹%.2f%n",symbol,company,price);
    }
}