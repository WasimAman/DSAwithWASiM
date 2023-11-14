package DSAwithWASiM.DSAwithWasim.Array;
class Profit{
    public int maxProfit(int[] price){
        // 7,1,5,3,6,4
        int overallProfit = 0;
        int profitIfSoldToday = 0;
        int newStockPrice = Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            if(price[i]<newStockPrice){
                newStockPrice = price[i];
                // newStockPrice = 1
            }
            profitIfSoldToday = price[i]-newStockPrice;
            // profitIfSoldToday = 3
            if(profitIfSoldToday>overallProfit){
                overallProfit = profitIfSoldToday;
                // overallProfit = 5
            }
        }
        return overallProfit;
    }
}
public class BestTimeToBuyAndSellAStock {
    public static void main(String[] args) {
        // int[] price = {5,6,1,2,3,4};
        int[] price = {7,1,5,3,6,4};
        Profit p =new Profit();
        System.out.print("Max profit is:- "+p.maxProfit(price));
    }
}
