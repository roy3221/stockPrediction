package china.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.stock.prediction.china.controller.SentimentAnalysis;

public class SentimentAnalysisTest {
	
	@Test
	public void test() {
		int result = SentimentAnalysis.analyze("Alibaba's price will increase a lot");
		System.out.println(result);
		assertTrue(result > 0);
	}
}
