import org.testng.Assert;
import org.testng.annotations.Test;

public class tests extends Base {
	@Test
	public void validlogintest() {
		pages login=new pages(driver);
		login.login("standard_user","secret_sauce");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));


}
	
	
}
