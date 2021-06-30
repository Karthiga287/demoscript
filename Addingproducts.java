import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Addingproducts {
	public WebDriver ldriver;
	
	public Addingproducts(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	WebElement search= ldriver.findElement(By.id("twotabsearchtextbox"));
	WebElement searchbutton= ldriver.findElement(By.id("nav-search-submit-button"));
	WebElement wishbutton=ldriver.findElement(By.id("wishlist"));
	WebElement addtocart=ldriver.findElement(By.className(("addtocart"));
	WebElement cartbutton=ldriver.findElement(By.id("mycart"));
	WebElement we = new WebDriverWait(ldriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Related searches']")));
    WebElement Wishlist=ldriver.findElement(By.name("addtowishlist"));
    List<WebElement> resultsList = ldriver.findElements(By.xpath(".//span[@class='a-size-medium a-color-base a-text-normal']"));
        
	
    public void searchfirstitem(String firstproduct) {
		// TODO Auto-generated method stub
		search.clear();
		search.sendKeys(firstproduct);
		searchbutton.click();
		}

	public void addfirstitem() {
		// TODO Auto-generated method stub
		 int size = resultsList.size();
         resultsList.get(0).click();
        Wishlist.click();
        	}

	public void searchseconditem(String secondproduct) {
		// TODO Auto-generated method stub
		search.clear();
		search.sendKeys(secondproduct);
		searchbutton.click();
		
		
	}

	public void addseconditem() {
		// TODO Auto-generated method stub
		int size = resultsList.size();
        resultsList.get(0).click();
        Wishlist.click();
		
	}

	public void searchthirditem(String thirdproduct) {
		// TODO Auto-generated method stub
		search.clear();
		search.sendKeys(thirdproduct);
		searchbutton.click();
		
	}

	public void addthirditem() {
		// TODO Auto-generated method stub
		int size = resultsList.size();
        resultsList.get(0).click();
        Wishlist.click();
		
	}

	public void searchfourthitem(String fourthproduct) {
		search.clear();
		search.sendKeys(fourthproduct);
		searchbutton.click();
		
		// TODO Auto-generated method stub
		
	}

	public void addfourthitem() {
		// TODO Auto-generated method stub
		int size = resultsList.size();
        resultsList.get(0).click();
        Wishlist.click();
		
	}

	public void openwishlist() {
		// TODO Auto-generated method stub
		wishbutton.click();
		
	}

	public void checkfouritem() {
		// TODO Auto-generated method stub
		int expectedsize=4;
		int actualsize = resultsList.size();
        Assert.assertEquals("actualsize","expectedesize");
	}

	public void addlowprice() {
		// TODO Auto-generated method stub
		Select sortby=new select(ldriver.findElement(By.id("sortby"));
		sortby.selectByVisibleText("Price:lowtohigh");
			
	}

	public void addtocart() {
		// TODO Auto-generated method stub
		int size = resultsList.size();
        resultsList.get(0).click();
        addtocart.click();
        		
	}

	public void checkcart() {
		// TODO Auto-generated method stub
		cartbutton.click();
		int expectedsize=1;
		int actualsize = resultsList.size();
        Assert.assertEquals("actualsize","expectedesize");
		
		}

	public void closebrowser() {
		// TODO Auto-generated method stub
		ldriver.close();
		
	}
		
		
		
	}
	
	
	
}
