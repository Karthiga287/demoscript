import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps {
	public WebDriver driver;
	public Addingproducts ap;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Chrome driver1\\chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.manage().deleteAllCookies();
	driver. manage().window().maximize();
	ap=new Addingproducts(driver);
		}
	
	@When("User Opens URL(String)")
	public void user_opens_URL(String url)
		{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@When("User searches for (String)")
	public void user_searches_for(String firstitem)
		{
		ap.searchfirstitem(firstitem);
		Thread.sleep(3000);
		
	}
	
	@And ("User add the first mobile to Wish list")
	public void user_add_the_first_mobile_to_wish_list()
	{
		ap.addfirstitem();
		Thread.sleep(3000);
	}
	@Then ("User search for (String)")
	public void user_searches_for(String seconditem)
	ap.searchseconditem(seconditem);
	{
	}
	@And ("User add the first laptop to wish list")
	public void user_add_the_first_laptop_to_wish_list()
	ap.addseconditem();
	
	{
	}
	@Then ("User search for (String)")
	public void user_search_for(String thirditem)
	{
	ap.searchthirditem(thirditem);
	
	}
	@And ("User add the first Powerbank to wish list")
	public void user_add_the_first_Powrebank_to_wish_list()
	{
	ap.addthirditem();
	
	}
	@Then ("User search for (String)")
	public void user_search_for(String fourthitem)
	{
		ap.searchfourthitem(fourthitem);
	}
	@And ("User add the first Ipad to wish list")
	public void user_add_the_first_Ipad_to_wish_list()
		{
		ap.addfourthitem();
	}
	@And ("User open the Wishlist")
	public void User_open_the_Wishlist()
	ap.openwishlist();
	{
	}
	@Then ("User should see the four products in the wishlist")
	public void  User_should_see_the_four_products_in_the_wishlist()
	{
		ap.checkfouritem();
	}
	@When ("User search for lowest price product")
	public void  User_search_for_lowest_price_product()
	{
		ap.addlowprice();
	}
	@And ("User add the lowest price product to My cart")
	public void  User_add_the_lowest_price_product_to_My_cart() {
	ap.addtocart();
	
	}
	@Then ("User should see the Product in My cart")
	public void  User_should_see_the_Product_in_My_cart() {
	ap.checkcart();
	
	}
	@And ("close browser")
	public void  close_browser()
	{
		ap.closebrowser();
	}
	
	
	
	
	
	
			
	}
	

	


