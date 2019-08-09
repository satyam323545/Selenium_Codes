package test_set;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class NewTest {
	Functions data=new Functions();
	
	
	@Given("^Main page is open$")
	public void main_page_is_open() throws Throwable {
		data.main_page_verify();
	}

	@When("^User clicks on administration link$")
	public void user_clicks_on_administration_link() throws Throwable {
	   data.click_link_administration();
	}

	@Then("^User can see the administration menu$")
	public void user_can_see_the_administration_menu() throws Throwable {
	   data.verify_admin_menu();
	}

	@When("^user clicks on categories$")
	public void user_clicks_on_categories() throws Throwable {
	   data.click_link_categories();
	}

	@Then("^User can see List of Store categories table$")
	public void user_can_see_List_of_Store_categories_table() throws Throwable {
	    data.verify_list_categories();
	}

	@When("^user clicks on Add New link$")
	public void user_clicks_on_Add_New_link() throws Throwable {
	    data.add_new_link();
	}

	@When("^Enter category name$")
	public void enter_category_name() throws Throwable {
	   data.add_category_name();
	}

	@When("^Click add$")
	public void click_add() throws Throwable {
	   data.click_add_button();
	}

	@Then("^name is available in the list of categories$")
	public void name_is_available_in_the_list_of_categories() throws Throwable {
	    data.verify_name_in_categories();
	}

	@When("^user clicks on products$")
	public void user_clicks_on_products() throws Throwable {
	   data.click_link_products();
	}

	@When("^user clicks on add new$")
	public void user_clicks_on_add_new() throws Throwable {
	    data.add_product_link();
	}

	@When("^user adds new product$")
	public void user_adds_new_product() throws Throwable {
	   data.add_product();
	}

	@Then("^new product is added in the list$")
	public void new_product_is_added_in_the_list() throws Throwable {
	    data.verify_product();
	}
}
