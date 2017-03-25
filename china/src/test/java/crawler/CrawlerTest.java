package crawler;

import org.junit.Test;

public class CrawlerTest {
 
	
	@Test
	public void test() {
		try {
			Controller.configure();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
