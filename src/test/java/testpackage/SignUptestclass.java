package testpackage;

import org.openqa.selenium.Alert;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basepackaje.BaseclassDemoStore;
import pompackage.pomsignin;

public class SignUptestclass extends BaseclassDemoStore{
	pomsignin sign;
	public SignUptestclass() {
		super();
}
@BeforeSuite
public void initsetup() throws InterruptedException {
	initiation();
    sign=new pomsignin();
    Thread.sleep(2000);
}
@Test(priority=1)
public void Title() throws InterruptedException {
String actual=sign.verify();
System.out.println(actual);
Assert.assertEquals(actual, "STORE");
Thread.sleep(2000);


}
@Test (priority=2)
public void Signup() throws InterruptedException

{
sign.clickSignUp();
Thread.sleep(2000);
sign.typeusername(prop.getProperty("Username"));
sign.typepassword(prop.getProperty("Password"));
Thread.sleep(5000);
sign.clicksignupbtn();
Thread.sleep(2000);
Alert al=driver.switchTo().alert();
al.accept();
Thread.sleep(2000);
sign.cancelbutton();

}

@Test(priority=3)
public void login() throws InterruptedException
{
sign.clicksLogin();
Thread.sleep(2000);
sign.typeusername1(prop.getProperty("Username"));
sign.typepassword1(prop.getProperty("Password"));
Thread.sleep(2000);
sign.clicksloginbtn();
Thread.sleep(2000);
}



@Test(priority=4)
public void AddToCart() throws InterruptedException{

sign.laptopbtn();
sign.laptop();
Thread.sleep(2000);
sign.AddToCart();
Thread.sleep(2000);
Alert al=driver.switchTo().alert();
al.accept();
sign.Cartbtn();
driver.close();
}}

















