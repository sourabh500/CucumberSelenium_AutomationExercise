package StepDefinations;

import PageObjects.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps {

    public WebDriver driver;
    public RegisterPage RegPg;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        RegPg=new RegisterPage(driver);

    }
    @When("User opens url {string}")
    public void user_opens_url(String url) {

        driver.get(url);

    }
    @Then("User click on Signup Login button")
    public void user_click_on_signup_login_button() {

        RegPg.ClickOnSignupLogin();
    }
    @Then("User verify New User Signup! is visible")
    public void user_verify_new_user_signup_is_visible()
    {

        RegPg.NewUserSignupText();

    }

    @Then("User enters Name as {string} and Email as {string}")
    public void user_enters_name_as_and_email_as(String name, String email)
    {
        RegPg.EnterName(name);
        RegPg.EnterEmail(email);

    }
    @Then("click on Signup button")
    public void click_on_signup_button()
    {
        RegPg.ClickSignUpButton();
    }

    @Then("User verify ENTER ACCOUNT INFORMATION is visible")
    public void user_verify_enter_account_information_is_visible()
    {
        RegPg.AccountInfoText();
    }
    @Then("User enter the details Title as Mr, Password as {string}, Date of birth Day as {string}, Month as {string}, Year as {string}")
    public void user_enter_the_details_title_as_mr_password_as_date_of_birth_day_as_month_as_year_as(String Pass, String day, String month, String year)
    {
        RegPg.Title();
        RegPg.RegPassword(Pass);
        RegPg.DteOfBirth(day,month,year);

    }
    @Then("User select checkbox Sign up for our newsletter!")
    public void user_select_checkbox_sign_up_for_our_newsletter()
    {
        RegPg.CheckBoxNewsletterClick();
    }
    @Then("User fill details First name as {string}, Last name as {string}, Company as {string}, Address1 as {string}, State as {string}, City as {string}, Zipcode as {string}, Mobile Number as {string}")
    public void user_fill_details_first_name_as_last_name_as_company_as_address1_as_state_as_city_as_zipcode_as_mobile_number_as(String first, String last, String comp, String Address, String state, String city, String zip, String Mob)
    {
        RegPg.EnterDetails(first,last,comp,Address,state,city,zip,Mob);
    }
    @Then("User click Create Account button")
    public void user_click_create_account_button()
    {

        RegPg.ClickCreateAcc();
    }

    @Then("User verify that ACCOUNT CREATED! is visible")
    public void user_verify_that_account_created_is_visible()
    {
        RegPg.AccountCreatedText();
    }

    @Then("User click continue button")
    public void user_click_continue_button()
    {
        RegPg.ClickContinueButton();
    }

    @Then("User Verify that Logged in as username is visible")
    public void user_verify_that_logged_in_as_username_is_visible()
    {
        RegPg.LoggedInText();
    }

    @Then("User Click Delete Account button")
    public void user_click_delete_account_button()
    {
     RegPg.ClickDeleteButton();
    }

    @Then("User Verify that ACCOUNT DELETED! is visible")
    public void user_verify_that_account_deleted_is_visible()
    {
        RegPg.AccountDeleteText();
    }


    //Login

    @Then("User Verify Login to your account is visible")
    public void user_verify_login_to_your_account_is_visible()
    {
     RegPg.LoginToAccText();
    }

    @Then("User Enter email address as {string} and password as {string}")
    public void user_enter_email_address_as_and_password_as(String Email, String Pass)
    {
     RegPg.EnterLoginEmail(Email);
     RegPg.EnterLoginPass(Pass);
    }

    @Then("User Click login button")
    public void user_click_login_button()
    {
        RegPg.ClickLoginButton();
    }

    //Logout

    @Then("User click on Logout button")
    public void user_click_on_logout_button()
    {
     RegPg.ClickLogout();
    }

    //Search product

    @Then("User Click on Products button")
    public void user_click_on_products_button()
    {
        RegPg.ClickOnProducts();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully()
    {
     RegPg.VerifyAllProductsPage();
    }

    @Then("User Enter product name in search as {string} and click on search button")
    public void user_enter_product_name_in_search_as_and_click_on_search_button(String name)
    {
        RegPg.EnterProductName(name);
        RegPg.ClickOnSearchButton();
    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible()
    {

        RegPg.VerifySearchedProductText();
    }

    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible()
    {

        RegPg.VerifyAllTheSearchedProductsName();
    }


    //Add To Cart

    @Then("User Hover over first product and click Add to cart")
    public void user_hover_over_first_product_and_click_add_to_cart() {

        RegPg.ClickOnAddToCart1();
    }

    @Then("User Click Continue Shopping button")
    public void user_click_continue_shopping_button() {

        RegPg.ClickOnContinueShopping();
    }

    @Then("User Hover over second product and click Add to cart")
    public void user_hover_over_second_product_and_click_add_to_cart() {

        RegPg.ClickOnAddToCart2();
    }

    @Then("User Click View Cart button")
    public void user_click_view_cart_button() {

        RegPg.ClickOnViewCart();
    }

    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {

        RegPg.VerifyBothProduct();
    }

    @Then("Verify their prices and quantity")
    public void verify_their_prices_and_quantity() {

        RegPg.VerifyPricesAndQuantity();
    }


}
