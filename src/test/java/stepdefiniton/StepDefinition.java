package stepdefiniton;

import java.net.MalformedURLException;

import Base.BaseClass;
import Search.SearchPage;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {
	SearchPage searchpage;

	@Given("user should be in the youtube application homepage")
	public void user_should_be_in_the_youtube_application_homepage() throws MalformedURLException {
		desiredSetUp();
	}
	@When("user should enter the {string} to search")
	public void user_should_enter_the_to_search(String string) {
		searchpage = new SearchPage();
		btnClick(searchpage.getM1().get(0));
		setText(searchpage.getM2().get(0), string);
		btnClick(searchpage.getM2().get(0));
	}
	@When("user should be able to view the suggestion of the search and relevant option has to be selected")
	public void user_should_be_able_to_view_the_suggestion_of_the_search_and_relevant_option_has_to_be_selected() {
		searchpage = new SearchPage();
		btnClick(searchpage.getM3().get(0));
		btnClick(searchpage.getM4().get(0));
	}
	@Then("user should viewing the video playing")
	public void user_should_viewing_the_video_playing() {
		quit();
	}
}
