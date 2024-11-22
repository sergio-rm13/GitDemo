package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last");
		System.out.println("I will execute last2");
		System.out.println("I will execute last3");
		
		
	}
	@Test
	public void Demo() {
		System.out.println("Hello world");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("I am the nº 1 from last");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("Bye world");
	}
}
