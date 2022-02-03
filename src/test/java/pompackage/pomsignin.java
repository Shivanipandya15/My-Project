package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackaje.BaseclassDemoStore;

public class pomsignin extends BaseclassDemoStore {
public String verify() {
	return driver.getTitle();
}
	
//sign up 
	@FindBy(id="signin2")
	WebElement SignUp ;
	@FindBy(id="sign-username")
	WebElement username ;
	@FindBy(id="sign-password")
	WebElement password ;
	@FindBy(css="#signInModal > div > div > div.modal-footer > button.btn.btn-primary")
	WebElement signupbtn ;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/button/span")
	WebElement cancelbtn ;
	
// LogIn
	
    @FindBy(id="login2")
    WebElement Login;
    @FindBy(id="loginusername")
    WebElement Username1;
    @FindBy(id="loginpassword")
    WebElement password1;
    @FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    WebElement loginbtn;

//laptop add to cart
    @FindBy(xpath="/html/body/div[5]/div/div[1]/div/a[3]")
    WebElement laptopbtn;
    @FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div/a/img")
    WebElement laptop;
    @FindBy(partialLinkText="Add to cart")
    WebElement AddToCart;
    @FindBy(id="cartur") 
    WebElement Cartbtn;
   
    public pomsignin() {
     PageFactory.initElements(driver, this);
    }
	public void clickSignUp() {SignUp.click();
	}
	public void typeusername(String Username) {username.sendKeys(Username);
	}
	public void typepassword(String Password) {password.sendKeys(Password);
	}
	public void clicksignupbtn() {signupbtn.click();
	}
	public void cancelbutton() {cancelbtn.click();
	}
	public void clicksLogin() {Login.click();
	}
	public void typeusername1(String Username) {Username1.sendKeys(Username);
	}
	public void typepassword1(String Password) {password1.sendKeys(Password);
	}
	public void clicksloginbtn() {loginbtn.click();
	}
	public void laptopbtn() {laptopbtn.click();
	}
	public void laptop() {laptop.click();
	}
	public void AddToCart() {AddToCart.click();
	}
	public void Cartbtn() {Cartbtn.click();
		
	}
	
	
    
    
    
    
}





