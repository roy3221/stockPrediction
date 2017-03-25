package com.stock.prediction.china;

import com.stock.prediction.china.controller.SentimentAnalysis;

public class Main {
	
	public static void main(String[] args){
		
		
		
		int result = SentimentAnalysis.analyze("China is the best nation!");
		System.out.println(result);
	}
	
}
