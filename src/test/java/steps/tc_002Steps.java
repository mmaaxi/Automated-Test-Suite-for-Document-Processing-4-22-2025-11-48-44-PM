package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        page.navigateToUploadPage();
    }

    @When("I upload a valid {string} file")
    public void i_upload_a_valid_file(String fileType) {
        page.uploadFile(fileType);
    }

    @Then("I should see the file preview with name, size, and type")
    public void i_should_see_the_file_preview_with_name_size_and_type() {
        Assert.assertTrue("File preview not displayed", page.isPreviewDisplayed());
        Assert.assertTrue("File name incorrect", page.isFileNameCorrect());
        Assert.assertTrue("File size incorrect", page.isFileSizeCorrect());
        Assert.assertTrue("File type incorrect", page.isFileTypeCorrect());
    }
}