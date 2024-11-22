package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Aparezco antes de que se ejecute cualquier method en la clase");
	}

	@Parameters({ "URL", "userName" })
	@Test
	public void WebLoginCarLoan(String urlName, String key) {
		// selenium
		System.out.println("webloginCar");
		System.out.println(urlName);
		System.out.println(key);
	}

	@BeforeMethod
	public void beforeEvery() {
		System.out.println("Aparezco al principio de cada test de Day3");
	}

	@AfterMethod
	public void afterEvery() {
		System.out.println("Aparezco al final de cada test de Day3");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Aparezco después de que se ejecute cualquier method en laclase");
	}

	@Test(groups = { "Smoke" })
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("MobileloginCar");
	}

	@BeforeTest
	public void BfSuite() {
		System.out.println("I am nº 1");
	}

	@Test(enabled = false)
	public void MobileSignimCarLoan() {
		System.out.println("Mobile SIGIN CAR");
	}

	@Test(dataProvider = "getData")
	public void MobileSignOutCarLoan(String username, String password) {
		System.out.println("Mobile SIGNOUT CAR");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods = { "WebLoginCarLoan", "MobileSignOutCarLoan" })
	public void APICarLoan() {
		// Rest API automation
		System.out.println("APIloginCar");
	}

	@DataProvider
	public Object[][] getData() {
		// 1st combination - username password - good credit history
		// 2nd - username password - no credit history
		// 3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		// columns in the row are nothing but values for that particular
		// combination(row)

		// 2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}
