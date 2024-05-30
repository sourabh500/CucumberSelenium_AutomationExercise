package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver ldriver;

    public RegisterPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(linkText = "Signup / Login")
    WebElement SignupLoginButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    WebElement NewUserText;

    @FindBy(name = "name")
    WebElement SignupName;

    @FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
    WebElement SignupEmail;

    @FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
    WebElement SignupButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
    WebElement AccountInfo;

    @FindBy(id = "id_gender1")
    WebElement Gender;

    @FindBy(xpath = "//input[@data-qa=\"password\"]")
    WebElement Password;

    @FindBy(id="days")
    WebElement Day;

    @FindBy(id="months")
    WebElement Month;

    @FindBy(id="years")
    WebElement Year;

    @FindBy(id="newsletter")
    WebElement checkboxNewsletter;

    @FindBy(name="first_name")
    WebElement FirstName;

    @FindBy(name="last_name")
    WebElement LastName;

    @FindBy(id="company")
    WebElement Company;

    @FindBy(id="address1")
    WebElement Address;

    @FindBy(id="state")
    WebElement State;

    @FindBy(id="city")
    WebElement City;

    @FindBy(id="zipcode")
    WebElement Zipcode;

    @FindBy(id="mobile_number")
    WebElement MobNumber;

    @FindBy(xpath="//button[@data-qa=\"create-account\"]")
    WebElement CreateAccountButton;  

    @FindBy(xpath="//*[@id=\"form\"]/div/div/div/h2/b")
    WebElement AccountCreatedText;

    @FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")
    WebElement ContinueButton;

    @FindBy(linkText = "Delete Account")
    WebElement DeleteAcc;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")
    WebElement LoggedInUsernameText;

    @FindBy(xpath = "//[@data-qa=\"account-deleted\"]")
    WebElement AccountDeletedText;

    //Login

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/h2")
    WebElement LoginText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement LoginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement LoginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement LoginButton;

    //Logout

    @FindBy(xpath = "//a[@href='/logout']")
    WebElement LogoutButton;

    //Search

    @FindBy(xpath = "//a[@href='/products']")
    WebElement ProductsButton;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/h2")
    WebElement AllProductsText;

    @FindBy(id = "search_product")
    WebElement SearchProduct;

    @FindBy(id = "submit_search")
    WebElement SearchButton;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/h2")
    WebElement SearchProductsText;

    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/p")
    WebElement VerifyTshirt;

    //Add To Cart

    @FindBy(xpath = "//a[@data-product-id='1']")
    WebElement AddToCart1;

    @FindBy(className = "btn btn-success close-modal btn-block")
    WebElement ContinueShoppingButton;

    @FindBy(xpath = "//a[@data-product-id='2']")
    WebElement AddToCart2;

    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement ViewCart;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    WebElement Product1;

    @FindBy(xpath = "//a[@href='/product_details/2']")
    WebElement Product2;

    @FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_price']")
    WebElement VerifyPrice1;

    @FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_price']")
    WebElement VerifyPrice2;

    @FindBy(xpath = "//tr[@id='product-1']//td[@class='cart_quantity']")
    WebElement VerifyQuantity1;

    @FindBy(xpath = "//tr[@id='product-2']//td[@class='cart_quantity']")
    WebElement VerifyQuantity2;


    //Checkout

    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement CartButton;

    @FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[1]/ol/li[2]")
    WebElement TextShoppingCart;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement CheckoutButton;

    @FindBy(xpath = "//li[@class='address_city address_state_name address_postcode']")
    WebElement AddressDetails;






    public void ClickOnSignupLogin()
    {
        SignupLoginButton.click();
    }

    public void NewUserSignupText()
    {
        NewUserText.isDisplayed();
    }

    public void EnterName(String RegName)
    {
        SignupName.sendKeys(RegName);
    }

    public void EnterEmail(String RegEmail)
    {
        SignupEmail.sendKeys(RegEmail);
    }

    public void ClickSignUpButton()
    {
        SignupButton.click();
    }

    public void AccountInfoText()
    {
        AccountInfo.isDisplayed();
    }

    public void Title()
    {
        Gender.click();
    }

    public void RegPassword(String Pwd)
    {
        Password.sendKeys(Pwd);
    }

    public void DteOfBirth(String D,String M,String Y)
    {
        Day.sendKeys(D);
        Month.sendKeys(M);
        Year.sendKeys(Y);
    }

    public void CheckBoxNewsletterClick()
    {
        checkboxNewsletter.click();
    }

    public void EnterDetails(String F,String L,String Comp,String Add,String Sta,String cit,String Zip,String Mob)
    {
        FirstName.sendKeys(F);
        LastName.sendKeys(L);
        Company.sendKeys(Comp);
        Address.sendKeys(Add);
        State.sendKeys(Sta);
        City.sendKeys(cit);
        Zipcode.sendKeys(Zip);
        MobNumber.sendKeys(Mob);

    }

    public void ClickCreateAcc()
    {
        CreateAccountButton.click();
    }

    public void AccountCreatedText()
    {
        AccountCreatedText.isDisplayed();
    }

    public void ClickContinueButton()
    {
        ContinueButton.click();
    }

    public void LoggedInText()
    {
        LoggedInUsernameText.isDisplayed();
    }

    public void ClickDeleteButton()
    {
        DeleteAcc.click();
    }

    public void AccountDeleteText()
    {
        AccountDeletedText.isDisplayed();
    }

    //Login

    public void LoginToAccText()
    {
        LoginText.isDisplayed();
    }

    public void EnterLoginEmail(String LogEmail)
    {
        LoginEmail.sendKeys(LogEmail);
    }

    public void EnterLoginPass(String LogPass)
    {
        LoginPassword.sendKeys(LogPass);
    }

    public void ClickLoginButton()
    {
        LoginButton.click();
    }

    //Logout

    public void ClickLogout()
    {
        LogoutButton.click();
    }

    //Search Product

    public void ClickOnProducts()
    {
        ProductsButton.click();
    }

    public void VerifyAllProductsPage()
    {
        String T=AllProductsText.getText();
        if (T.equals("All Products"))
        {
            System.out.println("Text is visible");
        }
        else
            System.out.println("Text is not visible");
    }

    public void EnterProductName(String ProductName)
    {
        SearchProduct.sendKeys(ProductName);
    }

    public void ClickOnSearchButton()
    {
        SearchButton.click();
    }

    public void VerifySearchedProductText()
    {
        String P=SearchProductsText.getText();
        if(P.equals("Searched Products"))
        {
            System.out.println("Text is visible");
        }
        else
            System.out.println("Text is not visible");
    }


    public void VerifyAllTheSearchedProductsName()
    {
        String Ts=VerifyTshirt.getText();
        if (Ts.equals("Men Tshirt"))
        {
            System.out.println("Product is same as searched");
        }
        else
            System.out.println("Product is not same");
    }

    //Add To Cart

    public void ClickOnAddToCart1()
    {
        AddToCart1.click();
    }

    public void ClickOnContinueShopping()
    {
        ContinueShoppingButton.click();
    }

    public void ClickOnAddToCart2()
    {
        AddToCart2.click();
    }

    public void ClickOnViewCart()
    {
        ViewCart.click();
    }

    public void VerifyBothProduct()
    {
        String p1=Product1.getText();
        if (p1.equals("Blue Top"))
        {
            System.out.println("Product is same");
        }
        else System.out.println("Product is not same");

        String p2=Product2.getText();
        if (p2.equals("Men Tshirt"))
        {
            System.out.println("Product is same");
        }
        else
            System.out.println("Product is not same");
    }

    public void VerifyPricesAndQuantity()
    {
        String price1=VerifyPrice1.getText();
        if (price1.equals("Rs. 500"))
        {
            System.out.println("Price is valid");
        }
        else
            System.out.println("Price is invalid");

        String price2=VerifyPrice2.getText();
        if(price2.equals("Rs. 400"))
        {
            System.out.println("Price is valid");
        }
        else
            System.out.println("Price is invalid");

        String quant1=VerifyQuantity1.getText();
        if (quant1.equals("1"))
        {
            System.out.println("Product quantity is valid");
        }
        else
            System.out.println("Product quantity is invalid");

        String quant2=VerifyQuantity2.getText();
        if (quant2.equals("1"))
        {
            System.out.println("Product quantity is valid");
        }
        else
            System.out.println("Product quantity is invalid");

    }

    //Checkout

    public void ClickOnCartButton()
    {

    }

    public void VerifyCartPage()
    {

    }

    public void ClickOnProceedToCheckout()
    {

    }

    public void VerifyAddressDetails()
    {

    }




}
