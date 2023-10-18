package stepDef;

import io.cucumber.java.en.*;

public class TestImplementation {
	
	@Given("User launch StarHealth application with {string}")
	public void user_launch_star_health_application_with(String string) {
	    
		System.out.println("AAAAAAAAAAAAAA");
	}

	@When("User wait for Welcome to Star Health pop up")
	public void user_wait_for_welcome_to_star_health_pop_up() {
	    
		System.out.println("BBBBBBBBBBBBBB");
	}

	@When("User close the pop up")
	public void user_close_the_pop_up() {
	   
		System.out.println("DDDDDDDDDDDDDDD");
	}

	@Then("User validate Star Health home page title using Junit assertion")
	public void user_validate_star_health_home_page_title_using_junit_assertion() {
	   
		System.out.println("ZZZZ");
	}

	@Then("User clicks on Buy Now Button")
	public void user_clicks_on_buy_now_button() {
	   
		System.out.println("SSSSSSS");
	}

	@Then("User Type Name as {string}")
	public void user_type_name_as(String string) {
	    
		System.out.println(string);
	}

	@Then("User Type Phone as {string}")
	public void user_type_phone_as(String string) {
	    
		System.out.println(string);
	}

	@Then("User Type PIN as {string}")
	public void user_type_pin_as(String string) {
	    
		System.out.println(string);

	}

	@When("User click on I need health insurance for drop down")
	public void user_click_on_i_need_health_insurance_for_drop_down() {
	    
		System.out.println("string");

	}

	@Then("User select option as {string}")
	public void user_select_option_as(String string) {
	    
		System.out.println(string);

	}

	@Then("User see Plan for My Family page")
	public void user_see_plan_for_my_family_page() {
	    
		System.out.println("string");

	}

	@Then("User validate mobile number same as previous page given number using Junit assertion")
	public void user_validate_mobile_number_same_as_previous_page_given_number_using_junit_assertion() {
		System.out.println("string");
	}

	@When("User clicks on Star Health logo")
	public void user_clicks_on_star_health_logo() {
		System.out.println("string");
	}

	@Then("Application should redirect to home page")
	public void application_should_redirect_to_home_page() {
		System.out.println("string");
	}

	@Then("User close the child TAB")
	public void user_close_the_child_tab() {
		System.out.println("string");
	}

	@Then("User navigate back to Parent TAB")
	public void user_navigate_back_to_parent_tab() {
		System.out.println("string");
	}

	@Given("User launch Pizzahut application with {string}")
	public void user_launch_pizzahut_application_with(String string) {
		System.out.println("string");
	}

	@When("User wait for auto location black pop up screen")
	public void user_wait_for_auto_location_black_pop_up_screen() {
		System.out.println("string");
	}

	@Then("User close the pop up screen")
	public void user_close_the_pop_up_screen() {
		System.out.println("string");
	}

	@Then("User see pop up for delivery asking for enter location")
	public void user_see_pop_up_for_delivery_asking_for_enter_location() {
		System.out.println("string");
	}

	@Then("User type address as {string}")
	public void user_type_address_as(String string) {
		System.out.println("string");
	}

	@Then("User select first auto populate drop down option")
	public void user_select_first_auto_populate_drop_down_option() {
		System.out.println("string");
	}

	@When("User navigate to deails page")
	public void user_navigate_to_deails_page() {
		System.out.println("string");
	}

	@Then("User validate vegetarian radio button flag is off")
	public void user_validate_vegetarian_radio_button_flag_is_off() {
		System.out.println("string");
	}

	@Then("User clicks on Pizzas menu bar option")
	public void user_clicks_on_pizzas_menu_bar_option() {
		System.out.println("string");
	}

	@When("User select add button of any pizza from Recommended")
	public void user_select_add_button_of_any_pizza_from_recommended() {
		System.out.println("string");
	}

	@Then("User see that the pizza is getting added under Your Basket")
	public void user_see_that_the_pizza_is_getting_added_under_your_basket() {
		System.out.println("string");
	}

	@Then("User validate pizza price plus Tax is checkout price")
	public void user_validate_pizza_price_plus_tax_is_checkout_price() {
		System.out.println("string");
	}

	@Then("User validate checkout button contains Item count")
	public void user_validate_checkout_button_contains_item_count() {
		System.out.println("string");
	}

	@Then("User validate checkout button contains total price count")
	public void user_validate_checkout_button_contains_total_price_count() {
		System.out.println("string");
	}

	@Then("User clicks on Drinks option")
	public void user_clicks_on_drinks_option() {
		System.out.println("string");
	}

	@Then("User select Pepsi option to add into the Basket")
	public void user_select_pepsi_option_to_add_into_the_basket() {
		System.out.println("string");
	}

	@Then("User see {int} items are showing under checkout button")
	public void user_see_items_are_showing_under_checkout_button(Integer int1) {
		System.out.println("string");
	}

	@Then("User see total price is now more than before")
	public void user_see_total_price_is_now_more_than_before() {
		System.out.println("string");
	}

	@Then("User remove the Pizza item from Basket")
	public void user_remove_the_pizza_item_from_basket() {
		System.out.println("string");
	}

	@Then("see Price tag got removed from the checkout button")
	public void see_price_tag_got_removed_from_the_checkout_button() {
		System.out.println("string");
	}

	@Then("User see {int} item showing in checkout button")
	public void user_see_item_showing_in_checkout_button(Integer int1) {
		System.out.println("string");
	}

	@Then("User Clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
		System.out.println("string");
	}

	@Then("User see minimum order required pop up is getting displayed")
	public void user_see_minimum_order_required_pop_up_is_getting_displayed() {
		System.out.println("string");
	}

}
