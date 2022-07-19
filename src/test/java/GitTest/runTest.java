package GitTest;

import org.testng.annotations.Test;

public class runTest {
@Test
	public void runnerTest() {
	
	String browser = System.getProperty("browser");
	String url = System.getProperty("url");
		System.out.println(" check for new test ");
		System.out.println(" check for new test ");
		System.out.println(browser);
		System.out.println(url);
		
	}
@Test
public void runner1Test()
{
	System.out.println("new method runner2 is added");
}
}
