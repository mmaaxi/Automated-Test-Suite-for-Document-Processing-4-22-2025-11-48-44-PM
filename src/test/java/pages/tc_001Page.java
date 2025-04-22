package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_001Page {

    WebDriver driver = DriverFactory.getDriver();

    private By cargarDocumentosButton = By.id("cargarDocumentosBtn");
    private By cargaUnicaOption = By.id("cargaUnica");
    private By cargaMultipleOption = By.id("cargaMultiple");
    private By singleUploadBox = By.id("singleUploadBox");
    private By multipleUploadBoxes = By.className("multipleUploadBox");

    public void navigateToCargaDocumentosPage() {
        driver.get("https://example.com/cargaDocumentos");
    }

    public void selectCargarDocumentosOption() {
        driver.findElement(cargarDocumentosButton).click();
    }

    public boolean isCargaUnicaOptionDisplayed() {
        return driver.findElement(cargaUnicaOption).isDisplayed();
    }

    public boolean isCargaMultipleOptionDisplayed() {
        return driver.findElement(cargaMultipleOption).isDisplayed();
    }

    public void selectCargaUnica() {
        driver.findElement(cargaUnicaOption).click();
    }

    public boolean isSingleUploadBoxDisplayed() {
        return driver.findElement(singleUploadBox).isDisplayed();
    }

    public void selectCargaMultiple() {
        driver.findElement(cargaMultipleOption).click();
    }

    public boolean areMultipleUploadBoxesDisplayed() {
        return driver.findElements(multipleUploadBoxes).size() > 0;
    }
}