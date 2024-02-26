package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class FirstTest {


    @Given("Admin is on NetBanking LogIn page")
    public void admin_is_on_net_banking_log_in_page() {

        System.out.println("welcome");

    }
    @When("^Admin log in into application with username (.+) and password (.+)$")
    public void admin_log_in_into_application_with_username_and_password(String user, String pass)
    {

        System.out.println(user);
        System.out.println(pass);
    }
    @Then("Home Page is displayed")
    public void home_page_is_displayed()
    {

        System.out.println("Bireswar");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed()
    {

        System.out.println("*****************");
    }
////////////////////////////////////////////////////////////////////////////

    @Given("User is on NetBanking LogIn page")
    public void user_is_on_net_banking_log_in_page()
    {

        System.out.println("welcome to all");
    }
    @When("^User log in into application with username1 (.+)  and password1 (.+)$")
    public void user_log_in_into_application_with_username1_and_password1(String usr, String pas )
    {

        System.out.println(usr);
        System.out.println(pas);
    }
    @Then("Home Page is visible")
    public void home_page_is_visible()
    {

        System.out.println("bye");
    }
    @Then("Cards are visible")
    public void cards_are_visible()
    {

        System.out.println("******************");
    }

    /////////////////////////////////////////////////////////////////////

    @Given("User is on MobileBanking LogIn page")
    public void user_is_on_mobile_banking_log_in_page()
    {
        System.out.println("welcome again");
    }
    @When("^User log in into application with (.+) and (.+) combination$")
    public void user_log_in_into_application_with_and_combination(String user2, String pass2)
    {

        System.out.println(user2);
        System.out.println(pass2);
    }
    @Then("Home Page can be seen")
    public void home_page_can_be_seen()
    {

        System.out.println("            ");
    }
    @Then("Cards can be seen")
    public void cards_can_be_seen()
    {

        System.out.println("*******************");
    }

    ////////////////////////////////////////////

    @Given("User is on SignUp page")
    public void user_is_on_SignUp_page()
    {

        System.out.println("Nice");
    }
    @When("User Sign up into application with following credentials")
    public void user_sign_up_into_application_with_following_credentials(io.cucumber.datatable.DataTable dataTable)
    {
    List<String>  data = dataTable.asList();
    String data0=data.get(0);
    String data1=data.get(1);
    String data2=data.get(2);
    String data3=data.get(3);

        System.out.println(data0);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);


    }
    @Then("Home Page is marked")
    public void home_page_is_marked()
    {

        System.out.println("Adhikary");
    }
    @Then("Cards are marked")
    public void cards_are_marked()
    {

        System.out.println("******************************");
    }

}
