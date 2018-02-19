package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoParameters {
	@Test(priority=1,groups={"user","smoke"})
	public void createuser(){
		Reporter.log("createuser", true);
		}
	@Test(priority=2,invocationCount=1,enabled=true,groups={"user"})
	public void editUser() {
		Reporter.log("editUser", true);
		}
	@Test(priority=3,groups= {"user"})
	public void deleteUser() {
		Reporter.log("deleteUser", true);
	}
	@Test(priority=1,groups= {"Product","smoke"})
	public void createProduct() {
		Reporter.log("createProduct", true);
	}
	@Test(priority=2,invocationCount=3,enabled=true,groups= {"Product"})
	public void editProduct() {
		Reporter.log("editProduct", true);
	}
@Test(priority=3,groups={"Product"})
public void deleteProduct() {
	Reporter.log("deleteProduct",true);
}
}
