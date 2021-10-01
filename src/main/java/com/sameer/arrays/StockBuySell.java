package com.sameer.arrays;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] stockPrices= {100,80,120,130,70,60,100,125};
		stockBuySellSingleTranscation(stockPrices);
		stockBuySellMultipleTranscation(stockPrices);
	}
	
	public static void stockBuySellSingleTranscation(int[] stockPrices) {
		int minPrice=Integer.MAX_VALUE;
		int profit=Integer.MIN_VALUE;
		
		for(int i=0;i<stockPrices.length;i++) {
			 profit=Math.max(profit, stockPrices[i]-minPrice);
			 minPrice=Math.min(minPrice, stockPrices[i]);	
		}
		System.out.println("Profit: "+profit+" min. Price: "+minPrice);
	}
	
	public static void stockBuySellMultipleTranscation(int[] stockPrices) {
		int totalProfit=0;

		for(int i=1;i<stockPrices.length;i++) {
			int profit=stockPrices[i]-stockPrices[i-1];
			if(profit>0) {
				totalProfit+=profit;
			}
		}
		
		System.out.println(totalProfit);

		
		
	}

}
